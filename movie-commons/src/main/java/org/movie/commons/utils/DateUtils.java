package org.movie.commons.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Stream;

/**
 * 日期工具類
 *
 * https://www.baeldung.com/java-8-date-time-intro
 *
 * @author amos
 * @date Aug 2, 2014 11:41:58 AM
 */
public final class DateUtils {
    /**
     * 默認的日期格式 yyyy-MM-dd HH:mm:ss
     */
    public static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_W_D_T_Z = "E yyyy-MM-dd HH:mm:ss.SSS Z";


    public static void main(String[] args) {
        String fmtStr = "E yyyy-MM-dd HH:mm:ss.SSS Z";

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(fmtStr);

        System.out.println(simpleDateFormat.format(new Date()));

    }



    static void java8DateTime(){

        System.out.println("Default Timezone:");
//		Stream.of(TimeZone.getAvailableIDs()).forEach(System.out::println);
        System.out.println();

//		ZoneId.getAvailableZoneIds().forEach(System.out::println);

//		System.out.println(TimeZone.getDefault().getDisplayName());
//		System.out.println(TimeZone.getDefault().getID());


        System.out.println();
        System.out.println();

        System.out.println("Date:");
        //yyyy-MM-dd
        System.out.println(LocalDate.now());

        System.out.println();
        System.out.println();

        System.out.println("Time:");
        /**The output will be one of the following ISO-8601 formats:
         * <ul>
         * <li>{@code HH:mm}</li>
         * <li>{@code HH:mm:ss}</li>
         * <li>{@code HH:mm:ss.SSS}</li>
         * <li>{@code HH:mm:ss.SSSSSS}</li>
         * <li>{@code HH:mm:ss.SSSSSSSSS}</li>
         * </ul>
         * */
        System.out.println(LocalTime.now());
    }
}
