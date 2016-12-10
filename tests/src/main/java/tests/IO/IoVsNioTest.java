package tests.IO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static org.eclipse.swt.internal.Compatibility.newFileInputStream;

/**
 * @author amos
 * @date 2016-11-19
 */
public class IoVsNioTest{
    public static void main(String[] args) {
        String filePath = "/opt/amos/java/intellijapps/movie/tests/src/main/java/tests/IO/test";

        methodIo(filePath);

        System.out.println();

        methodNio(filePath);

    }

    static void methodIo(String filePath) {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while (bytesRead != -1) {
                for (int i = 0; i < buf.length; i++) {
                    System.out.print((char)buf[i]);
                }
                bytesRead = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void methodNio(String filePath) {
        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile(filePath, "rw");

            FileChannel fileChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024);

            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);
            while (bytesRead != -1) {
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print((char)buf.get());
                }
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (aFile != null) {
                    aFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
