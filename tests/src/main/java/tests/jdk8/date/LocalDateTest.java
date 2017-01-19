package tests.jdk8.date;

import java.time.*;

/**
 * Created on 2017/1/19.
 */
public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(today());
        printYMD();
        birthday();
        toInstant();
    }
    
    static LocalDate today(){
        LocalDate today = LocalDate.now();
        
        return today;
    }
    
    static void printYMD(){
        LocalDate td = today();
        System.out.println("year:"+td.getYear()+" month:"+td.getMonthValue()+" day:"+td.getDayOfMonth()+
                "\nmon.:"+td.getMonth()+" yearDay:"+td.getDayOfYear()+" weekday:"+td.getDayOfWeek() +" weekdayint:"+td.getDayOfWeek().getValue());
    }
    
    static void birthday(){
        LocalDate dateOfBirth = LocalDate.of(2010, 01, 26);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());

        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else{
            System.out.println("Sorry, today is not your birthday");
        }
    }
    
    
    static void toInstant(){
       Instant instant = LocalDateTime.now().toInstant(ZoneOffset.of("+0"));
        System.out.println(instant);
    }
    
}
