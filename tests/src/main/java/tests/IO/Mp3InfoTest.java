package tests.IO;

import org.apache.commons.lang3.StringUtils;
import org.jaudiotagger.audio.mp3.MP3File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liushengri on 2017/5/9.
 */
public class Mp3InfoTest {
    static String suffix = ".mp3";
    ;

    public static void main(String[] args) throws IOException {
        Path destPathParent = Paths.get("E:\\tmp\\enm\\dailyen_mp3tt");
        Map<String, Integer> nameCountMap = new HashMap<>();

        Files.list(Paths.get("E:\\tmp\\enm\\dailyen_mp3")).forEach(path -> {
            try {
                Mp3MetaInfo mp3MetaInfo = new Mp3MetaInfo(path);
                System.out.println(mp3MetaInfo);

                String title = getTitle(mp3MetaInfo);
                if (StringUtils.isNotBlank(title)) {
                    Path destPath = Paths.get(destPathParent.toString(), title);
                    if (Files.exists(destPath)) {
                        Integer count = nameCountMap.get(mp3MetaInfo.getTitle());
                        if (count == null) {
                            count = 1;
                            nameCountMap.put(mp3MetaInfo.getTitle(), count);
                        } else {
                            count = count + 1;
                            nameCountMap.put(mp3MetaInfo.getTitle(), count);
                        }
                        int idx = title.indexOf(suffix);
                        title = title.substring(0, idx) + "_" + count + suffix;
                        destPath = Paths.get(destPathParent.toString(), title);
                    }
                    path.toFile().renameTo(destPath.toFile());
                } else {
                    Path destPath = Paths.get(destPathParent.toString(), path.getFileName().toString() + suffix);
                    path.toFile().renameTo(destPath.toFile());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    static String getTitle(Mp3MetaInfo mp3MetaInfo) {
        String title = "";
        if (StringUtils.isNotBlank(mp3MetaInfo.getAlbum())) {
            title = title + mp3MetaInfo.getAlbum() + "_";
        }
        if (StringUtils.isNotBlank(mp3MetaInfo.getArtist())) {
            title = title + mp3MetaInfo.getArtist() + "_";
        }
        if (StringUtils.isNotBlank(mp3MetaInfo.getTitle())) {
            title = title + mp3MetaInfo.getTitle();
        }
        if (StringUtils.isBlank(title)) {
            return title;
        }

        if (title.length() <= suffix.length() || !suffix.equals(title.substring(title.length() - suffix.length()).toLowerCase())) {
            title = title + suffix;
        }
        
        int quIdx = title.indexOf("?");
        while (quIdx > 0) {
            title = title.substring(0, quIdx) + title.substring(quIdx + 1);

            quIdx = title.indexOf("?");
        }

        int sIdx = title.indexOf("/");
        while (sIdx > 0) {
            title = title.substring(0, sIdx) + title.substring(sIdx + 1);

            sIdx = title.indexOf("/");
        }
        title.replaceAll("\\s","");

        return title;
    }

    static void jaudiotagger() throws IOException {
        Files.list(Paths.get("E:\\tmp\\enm\\mtest")).forEach(path -> {
            try {
                MP3File file = new MP3File(path.toFile());
                String songName = file.getID3v1Tag().getTitle().get(0).toString();
                String singer = file.getID3v1Tag().getArtist().get(0).toString();
                String author = file.getID3v1Tag().getAlbum().get(0).toString();

//                String songName = file.getID3v2Tag().frameMap.get("TIT2").toString();
//                String singer = file.getID3v2Tag().frameMap.get("TPE1").toString();
//                String author = file.getID3v2Tag().frameMap.get("TALB").toString();
                System.out.println(new String(songName.getBytes("ISO-8859-1"), "GB2312"));
                System.out.println(new String(singer.getBytes("ISO-8859-1"), "GB2312"));
                System.out.println(new String(author.getBytes("ISO-8859-1"), "GB2312"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    static void audio() throws IOException {
        Files.list(Paths.get("E:\\tmp\\enm\\mtest")).forEach(path -> {
            try {
                AudioFileFormat audioFileFormat = AudioSystem.getAudioFileFormat(path.toFile());

                System.out.println(audioFileFormat);
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
