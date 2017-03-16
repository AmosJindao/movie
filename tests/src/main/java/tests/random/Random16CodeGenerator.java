package tests.random;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.text.StrBuilder;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

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
 * log2(36^16-1)
 */
public class Random16CodeGenerator {
    static final String BASE_STR = "PLKI890OMJU7YGVBNH6TFCDE345RXSW2QZA1";
    static final char[] BASE = BASE_STR.toCharArray();

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
        generateTest();

//        decodeTest();
    }

    static void generateTest(){
        int num = 10000000;

        Set<String> codes = Sets.newHashSetWithExpectedSize(num);

        Stopwatch st = Stopwatch.createUnstarted();

        st.start();
        for (int i = 1; i <= num; i++) {
            while(true) {
                BigInteger finalBigInteger = gennum(new BigInteger("5"));
                String code = genCod(finalBigInteger);
                
//                System.out.println(i + ":" + finalBigInteger + "---code:" + code + "---length:" + code.length());
                
                if(codes.add(code)) {
                    break;
                }else {
                    System.out.println(i + ":" + finalBigInteger + "---code:" + code + "---length:" + code.length());
                }
            }

        }
        st.stop();

        System.out.println("add:"+num+"\trealNum:"+codes.size()+"\t" +st);
    }
    
    static void decodeTest(){
        //        1930796303423795376773751---code:rEUKMN19KS89QV5M---length:16
        BigInteger reBi = decode("REUKMN19KS89QV5M");

        BigInteger timeStamp = getTimeStamp(reBi);

        System.out.println(reBi+"\t"+timeStamp);

        System.out.println(LocalDateTime.ofEpochSecond(timeStamp.longValue()/1000,
                Long.valueOf(timeStamp.longValue() % 1000).intValue() * 1000000, ZoneOffset.of("+08:00")));
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
    
    private static BigInteger decode(String code){
        BigInteger reBi = new BigInteger("0");
        
        BigInteger bitBase = new BigInteger("1");
                
        BigInteger base = new BigInteger(String.valueOf(BASE.length));
        
        char[] codeArr = code.toCharArray();
        for(char cdc:codeArr){
            int idx = BASE_STR.indexOf(cdc);

            reBi = reBi.add(bitBase.multiply(new BigInteger(String.valueOf(idx))));

            bitBase = bitBase.multiply(base);
        }
        
        return reBi;
    }
    
    static BigInteger getTimeStamp(BigInteger srcBi){
        BigInteger timeStampTmp = srcBi.shiftRight(TIME_PART_SHIFT_BIT);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<TIME_PART_BIT; i++){
            sb.append("1");
        }
        
        BigInteger andTar = new BigInteger(sb.toString(),2);
        
        BigInteger timeStamp = timeStampTmp.and(andTar);
        
        return timeStamp;
    }
}
