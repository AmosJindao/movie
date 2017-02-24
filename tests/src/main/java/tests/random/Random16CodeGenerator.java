package tests.random;

import java.util.Random;

/**
 * created by 2017 2/22
 * 36 base character generate a string of length 16
 * <p>
 * 82 bits <br>
 * 16 random-------|  43bits timestamp---|  7    |   16 ran|
 *  4   |  12      |                     |       |         |
 * 00 ... 0        |    00...0           | 00...0|00...0   |
 * </p>
 * log2(34^8-1)
 */
public class Random16CodeGenerator {
    static final char[] BASE = "PLKI890OMJU7YGVBNH6TFCDE345rXSW2QZA1".toCharArray();

    static final int NUM_TYPE_BIT = 4;
    static final int NUM_INT_BIT = 31;
    static final int NUM_RAN_BIT = 9;

    static final int MAX_RAN_NUM = 2 ^ NUM_RAN_BIT;


    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            long finalNum = gennum(i, 5);
            System.out.println(i + ":" + finalNum + "---code:"+genCod(finalNum));


        }

        long millis = System.currentTimeMillis();
        System.out.println(millis+":"+genCod(millis));
        
        for(int i=1; i<10 ; i++){
            System.out.println(genCod((1l<<30 | (long)i)));
        }

    }


    static long gennum(int num, int type) {
        long finalNum = ((num << NUM_TYPE_BIT) | type);

        long randomNum = new Random().nextInt(MAX_RAN_NUM);

        long shiftHigh = NUM_INT_BIT + NUM_TYPE_BIT;

        long high = randomNum << shiftHigh;

        finalNum = (high | finalNum);

        return finalNum;
    }

    static String genCod(long num) {
        long base = BASE.length;

        StringBuilder sb = new StringBuilder();

        long division = num;
        while(division > 0) {
            int remainder = (int) (division % base);
            sb.append(BASE[remainder]);

            division = division / base;
        }
        
        return sb.toString();
    }
}
