package tests.jdk8.date;

import java.time.*;
import java.util.Date;

/**
 * Created by liushengri on 2017/4/19.
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(getCurDay());
    }
    
    static Date getCurDay(){
//        Instant instant = Instant.now();
       LocalDate localDate = LocalDate.now(ZoneId.of("Asia/Shanghai"));
        LocalTime localTime = LocalTime.of(0,0,0);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        return Date.from(localDateTime.toInstant(ZoneOffset.of("+08:00")));
    }
}
