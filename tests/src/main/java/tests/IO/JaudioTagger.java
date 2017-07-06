package tests.IO;

import com.sun.mail.imap.protocol.ID;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.id3.ID3v22Frame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by liushengri on 2017/5/9.
 */
public class JaudioTagger {
    static String suffix = ".mp3";
    public static void main(String[] args) throws IOException {
//        E:\tmp\enm\dailyen_mp3tt\esl
//        E:\tmp\enm\dailyen_mp3tt\新概念
        Files.list(Paths.get("E:\\tmp\\enm\\dailyen_mp3tt\\esl")).forEach(path -> {
            try {
                MP3File file = new MP3File(path.toFile());
                ID3v22Frame id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TT3");//TIT2 TT2 TT3
                String songName = id3v22Frame.getContent();

//                id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TP1");//TPE1
//                String singer = id3v22Frame.getContent();
//
//                id3v22Frame = (ID3v22Frame) file.getID3v2Tag().frameMap.get("TAL");//TALB
//                String author = id3v22Frame.getContent();
//
//                System.out.println(songName + "\t" + singer + "\t" + author);

                int quIdx = songName.indexOf("?");
                while (quIdx >= 0) {
                    songName = songName.substring(0, quIdx) + songName.substring(quIdx + 1);

                    quIdx = songName.indexOf("?");
                }

                Path destPath = Paths.get(path.getParent().toString(), songName+ suffix);
                path.toFile().renameTo(destPath.toFile());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
