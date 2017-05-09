package tests.IO;

import com.sun.mail.imap.protocol.ID;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.ID3v22Frame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by liushengri on 2017/5/9.
 */
public class JaudioTagger {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("E:\\tmp\\enm\\mtest")).forEach(path -> {
            try {
                MP3File file = new MP3File(path.toFile());
                ID3v22Frame id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TT2");
                String songName = id3v22Frame.getContent();

                id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TP1");
                String singer = id3v22Frame.getContent();

                id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TAL");
                String author = id3v22Frame.getContent();

                System.out.println(songName + "\t" + singer + "\t" + author);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
