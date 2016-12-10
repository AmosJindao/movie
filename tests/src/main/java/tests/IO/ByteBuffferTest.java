package tests.IO;

import java.nio.ByteBuffer;

/**
 * @author amos
 * @date 2016-11-20
 */
public class ByteBuffferTest{
    public static void main(String[] args) {
        ByteBuffer bf = ByteBuffer.allocate(10);

        bf.put("1234567890987654321".getBytes());

        System.out.println("nhk");

    }
}
