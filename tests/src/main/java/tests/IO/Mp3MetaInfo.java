package tests.IO;

import org.jaudiotagger.tag.TagNotFoundException;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liushengri on 2017/5/9.
 */
public class Mp3MetaInfo {

    protected String album = "";

    protected String artist = "";

    protected String comment = "";

    protected String title = "";

    protected String year = "";

    protected byte track;
    protected byte genre;

    public Mp3MetaInfo() {
    }

    public Mp3MetaInfo(Path path) throws IOException {
        RandomAccessFile file = new RandomAccessFile(path.toFile(), "r");//随机读写方式打开MP3文件
        readMp3Info(file);
        file.close();
    }

    public byte getTrack() {
        return track;
    }

    public void setTrack(byte track) {
        this.track = track;
    }

    public byte getGenre() {
        return genre;
    }

    public void setGenre(byte genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    //If field is less than maximum field length this is how it is terminated
    protected static final byte END_OF_FIELD = (byte) 0;

    //Used to detect end of field in String constructed from Data
    protected static Pattern endofStringPattern = Pattern.compile("\\x00");

    //Tag ID as held in file
    protected static final byte[] TAG_ID = {(byte) 'T', (byte) 'A', (byte) 'G'};

    //Fields Lengths common to v1 and v1.1 tags
    protected static final int TAG_LENGTH = 128;
    protected static final int FIELD_TAGID_LENGTH = 3;
    protected static final int FIELD_TITLE_LENGTH = 30;
    protected static final int FIELD_ARTIST_LENGTH = 30;
    protected static final int FIELD_ALBUM_LENGTH = 30;
    protected static final int FIELD_YEAR_LENGTH = 4;

    //Field Positions, starting from zero so fits in with Java Terminology
    protected static final int FIELD_TAGID_POS = 0;
    protected static final int FIELD_TITLE_POS = 3;
    protected static final int FIELD_ARTIST_POS = 33;
    protected static final int FIELD_ALBUM_POS = 63;
    protected static final int FIELD_YEAR_POS = 93;
    protected static final int FIELD_GENRE_POS = 127;
    protected static final int FIELD_COMMENT_LENGTH = 28;
    protected static final int FIELD_COMMENT_POS = 97;

    protected static final int FIELD_TRACK_INDICATOR_POS = 125;
    protected static final int FIELD_TRACK_POS = 126;

    private void readMp3Info(RandomAccessFile file) throws IOException {
        FileChannel fc;
        ByteBuffer byteBuffer = ByteBuffer.allocate(TAG_LENGTH);

        fc = file.getChannel();
        fc.position(file.length() - TAG_LENGTH);

        fc.read(byteBuffer);
        byteBuffer.flip();
        read(byteBuffer);
        
        fc.close();
    }

    /**
     * Read in a tag from the ByteBuffer
     *
     * @param byteBuffer from where to read in a tag
     * @throws TagNotFoundException if unable to read a tag in the byteBuffer
     */
    private void read(ByteBuffer byteBuffer) {
        if (!seek(byteBuffer)) {
            return;
        }

//        String encoding = "ISO-8859-1";
        String encoding = "GBK";
//        Mp3MetaInfo mp3MetaInfo = new Mp3MetaInfo();
        //Do single file read of data to cut down on file reads
        byte[] dataBuffer = new byte[TAG_LENGTH];
        byteBuffer.position(0);
        byteBuffer.get(dataBuffer, 0, TAG_LENGTH);
        title = getString(dataBuffer, FIELD_TITLE_POS, FIELD_TITLE_LENGTH, encoding).trim();
        Matcher m = endofStringPattern.matcher(title);
        if (m.find()) {
            title = title.substring(0, m.start());
        }
//        mp3MetaInfo.setTitle(title);

        artist = getString(dataBuffer, FIELD_ARTIST_POS, FIELD_ARTIST_LENGTH, encoding).trim();
//        m = endofStringPattern.matcher(artist);
//        if (m.find()) {
//            artist = artist.substring(0, m.start());
//        }
//        mp3MetaInfo.setArtist(artist);

        album = getString(dataBuffer, FIELD_ALBUM_POS, FIELD_ALBUM_LENGTH, encoding).trim();
//        m = endofStringPattern.matcher(album);
//        if (m.find()) {
//            album = album.substring(0, m.start());
//        }
//        mp3MetaInfo.setAlbum(album);

        String year = getString(dataBuffer, FIELD_YEAR_POS, FIELD_YEAR_LENGTH, encoding).trim();
//        m = endofStringPattern.matcher(year);
//        if (m.find()) {
//            year = year.substring(0, m.start());
//        }
//        mp3MetaInfo.setYear(year);

        comment = getString(dataBuffer, FIELD_COMMENT_POS, FIELD_COMMENT_LENGTH, encoding).trim();
//        m = endofStringPattern.matcher(comment);
//        if (m.find()) {
//            comment = comment.substring(0, m.start());
//        }
//        mp3MetaInfo.setComment(comment);

        track = dataBuffer[FIELD_TRACK_POS];
//        mp3MetaInfo.setTrack(track);

        genre = dataBuffer[FIELD_GENRE_POS];
//        mp3MetaInfo.setGenre(genre);

//        return mp3MetaInfo;
    }

    static boolean seek(ByteBuffer byteBuffer) {
        byte[] buffer = new byte[FIELD_TAGID_LENGTH];
        // read the TAG value
        byteBuffer.get(buffer, 0, FIELD_TAGID_LENGTH);
        if (!(Arrays.equals(buffer, TAG_ID))) {
            return false;
        }

        // Check for the empty byte before the TRACK
//        byteBuffer.position(FIELD_TRACK_INDICATOR_POS);
//        if (byteBuffer.get() != END_OF_FIELD) {
//            return false;
//        }
        //Now check for TRACK if the next byte is also null byte then not v1.1
        //tag, however this means cannot have v1_1 tag with track setField to zero/undefined
        //because on next read will be v1 tag.
//        return byteBuffer.get() != END_OF_FIELD;
        
        return true;
    }

    public static String getString(byte[] b, int offset, int length, String encoding)
    {
        try
        {
            return new String(b, offset, length, encoding);
        }
        catch (UnsupportedEncodingException ue)
        {
            //Shouldnt have to worry about this exception as should only be calling with well defined charsets
            throw new RuntimeException(ue);
        }
    }

    @Override
    public String toString() {
        return "Mp3MetaInfo{" +
                "album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", comment='" + comment + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", track=" + track +
                ", genre=" + genre +
                '}';
    }
}
