package tests.random;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Sets;

import java.math.BigInteger;
import java.util.*;

import static tests.random.RandomStrTest.MAX_RAN_NUM;
import static tests.random.RandomStrTest.NUM_INT_BIT;
import static tests.random.RandomStrTest.NUM_TYPE_BIT;

/**
 * created by 2017 2/22
 * 36 base character generate a string of length 16
 * <p>
 * 82 bits <br>
 * 16 random-------|  43bits timestamp---|  7    |   16 ran|
 * 4    |  12      |                     |       |         |
 * 00 ... 0        |    00...0           | 00...0|00...0   |
 * 4   |         78                                        |
 * </p>
 * log2(34^8-1)
 */
public class Random16CodeGenerator {
    static final char[] BASE = "PLKI890OMJU7YGVBNH6TFCDE345rXSW2QZA1".toCharArray();

    static final int LOWER_RAN_PART_BIT = 16;
    static final int BIZ_PART_BIT = 7;
    static final int TIME_PART_BIT = 43;
    static final int UPPER_RAN_PART_BIT = 16;
    static final int UPPER_RAN_PART_LOWER_BIT = 12;

    static final int LOWER_MAX_RAN_VALUE = 1 << LOWER_RAN_PART_BIT;
    static final int UPPER_MAX_RAN_VALUE = 1 << UPPER_RAN_PART_BIT;
    static final int UPPER_MIN_RAN_VALUE = 1 << UPPER_RAN_PART_LOWER_BIT;

    static final int BIZ_PART_SHIFT_BIT = LOWER_RAN_PART_BIT;
    static final int TIME_PART_SHIFT_BIT = LOWER_RAN_PART_BIT + BIZ_PART_BIT;
    static final int UPPER_RAN_PART_SHIFT_BIT = LOWER_RAN_PART_BIT + BIZ_PART_BIT + TIME_PART_BIT;

    static final BigInteger ZERO_BIG = new BigInteger("0");

    public static void main(String[] args) {
        int num = 1000000;

        Set<String> codes = Sets.newHashSetWithExpectedSize(num);

        Stopwatch st = Stopwatch.createUnstarted();
        
        st.start();
        for (int i = 1; i <= num; i++) {
            BigInteger finalBigInteger = gennum(new BigInteger("5"));

            String code = genCod(finalBigInteger);

//            System.out.println(i + ":" + finalBigInteger + "---code:" + code + "---length:" + code.length());
//            if (codes.contains(code)) {
//                System.out.println(i + ":" + finalBigInteger + "---code:" + code + "---length:" + code.length());
//            }

            codes.add(code);
        }
        st.stop();

        System.out.println("add:"+num+"\trealNum:"+codes.size()+"\t" +st);
    }

    static BigInteger gennum(BigInteger bizType) {
        BigInteger finalBigInteger = new BigInteger("0");

        BigInteger lowerRan = getLowerRandom();
        finalBigInteger = finalBigInteger.or(lowerRan);

        BigInteger bizTypeAfterShift = bizType.shiftLeft(BIZ_PART_SHIFT_BIT);
        finalBigInteger = finalBigInteger.or(bizTypeAfterShift);

        BigInteger timeStamp = new BigInteger(String.valueOf(System.currentTimeMillis()));
        BigInteger timeStampAfterShift = timeStamp.shiftLeft(TIME_PART_SHIFT_BIT);
        finalBigInteger = finalBigInteger.or(timeStampAfterShift);

        BigInteger upperRan = getUpperRandom();
        BigInteger upperRanAfterShift = upperRan.shiftLeft(UPPER_RAN_PART_SHIFT_BIT);
        finalBigInteger = finalBigInteger.or(upperRanAfterShift);

        return finalBigInteger;
    }

    static String genCod(BigInteger bigInteger) {
        BigInteger base = new BigInteger(String.valueOf(BASE.length));

        StringBuilder sb = new StringBuilder();

        BigInteger division = new BigInteger(bigInteger.toString());
        while (division.compareTo(ZERO_BIG) > 0) {
            BigInteger[] divideAndRemainder = division.divideAndRemainder(base);

            sb.append(BASE[divideAndRemainder[1].intValue()]);

            division = divideAndRemainder[0];
        }

        return sb.toString();
    }

    private static BigInteger getLowerRandom() {
        return getBigIntegerRandom(LOWER_MAX_RAN_VALUE);
    }

    private static BigInteger getBigIntegerRandom(int upBound) {
        BigInteger ranBigInteger = new BigInteger(String.valueOf(new Random().nextInt(upBound)));

        return ranBigInteger;
    }

    public static BigInteger getUpperRandom() {
        BigInteger minUpperRandom = new BigInteger(String.valueOf(UPPER_MIN_RAN_VALUE));
        BigInteger upperRandom = getBigIntegerRandom(UPPER_MAX_RAN_VALUE);

        while (upperRandom.compareTo(minUpperRandom) < 0) {
            upperRandom = getBigIntegerRandom(UPPER_MAX_RAN_VALUE);
        }

        return upperRandom;
    }
}
