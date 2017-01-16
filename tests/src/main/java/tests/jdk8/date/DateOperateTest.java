package tests.jdk8.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created on 2017/1/16.
 */
public class DateOperateTest {
    public static void main(String[] args) {
        Date curDt = new Date();
        
        System.out.println(minusDays(curDt,2*365));
    }
    
    static Instant minusDays(Date baseDate, long minusDays){
       return baseDate.toInstant().minus(minusDays, ChronoUnit.DAYS);
    }
}
