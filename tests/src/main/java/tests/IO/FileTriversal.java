package tests.IO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by liushengri on 2017/5/8.
 */
public class FileTriversal {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("E:\\tmp\\enm")).forEach(path -> {
            try {
                mp3Info(path.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    static void rename(Path path) {
        Path destPath = Paths.get(path.toString() + ".mp3");
        path.toFile().renameTo(destPath.toFile());
    }

    static void mp3Info(String mp3) throws Exception {
        int byteNum = 128;
        byte[] buf = new byte[byteNum]; //初始化标签信息的byte数组

        RandomAccessFile raf = new RandomAccessFile(mp3, "r");//随机读写方式打开MP3文件

        raf.seek(raf.length() - byteNum);//移动到文件MP3末尾

        raf.read(buf);//读取标签信息

        raf.close();//关闭文件

        if (buf.length != byteNum) {//数据长度是否合法

            throw new Exception("MP3标签信息数据长度不合法!");

        }
        
        String charsetName = "GBK";//utf-8

//        System.out.println(new String(buf,charsetName));
//        System.out.println(new String(buf));
//        System.out.println();
//        System.out.println();
//        System.out.println();
        if (!"TAG".equalsIgnoreCase(new String(buf, 0, 3))) {//标签头是否存在
return;
//            throw new Exception("MP3标签信息数据格式不正确!");

        }

//        标签头"TAG"    3字节

//        标题            30字节
        String songName = new String(buf, 3, 30, charsetName).trim();//歌曲名称

//        作者            30字节
        String artist = new String(buf, 33, 30, charsetName).trim();//歌手名字

//        专辑            30字节
        String album = new String(buf, 63, 30, charsetName).trim();//专辑名称

//        出品年份        4字节
        String year = new String(buf, 93, 4, charsetName).trim();//出品年份

//        备注信息        28字节
        String comment = new String(buf, 97, 28, charsetName).trim();//备注信息

//        保留            1字节
//
//        音轨            1字节
//
//        类型            1字节


        System.out.println(songName+"\n"+artist+"\n"+album+"\n"+year+"\n"+comment);


    }
}
