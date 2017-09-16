package tests.str;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by liushengri on 2017/2/22.
 */
public class StrTest {
    public static void main(String[] args) {
        System.out.println("101110110100000111000011110011100111000010110000010100000000000000000000000000".length());
        System.out.println("11010010101010011111110000111111010111010000100111000000000000000000000000000000000".length());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()+100l*365l*24l*60l*60l*1000l);
        System.out.println("10101101001100100011101100010011000011100".length());
        System.out.println("1000011100010100101101011010001110001110000".length());
        
        long millis = 100l*365l*24l*60l*60l*1000l;

       BigInteger bi = new BigInteger(String.valueOf(millis));
        System.out.println(bi.toString()+":"+bi.bitCount()+":"+bi.bitLength());
        
        new Random().nextInt(4096);
        
        String ss = "/files/test/png/test_ab(abcdefghj)fd/files/test/pngfdsd/abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdeffffffffffffffffghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijk";
        System.out.println(ss.length());
    }
}
