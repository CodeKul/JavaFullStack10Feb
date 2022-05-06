package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class LocalDateDemo {
    public static void main(String[] args) {

      /*  Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date1);*/

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        System.out.println(localDate.format(formatter));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.minusDays(3));
        System.out.println(localDate.plusDays(3));

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
        LocalTime localTime1 = LocalTime.of(20, 0, 0);
        System.out.println(localTime.format(formatter1));
        System.out.println(localTime.isBefore(localTime1));

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        System.out.println(zoneId);

        LocalTime localTime2 = LocalTime.now(zoneId);
        System.out.println(localTime2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(1994,5,20);
        System.out.println(localDate1);
        LocalTime localTime3 = LocalTime.of(10,10,20);
        System.out.println(localTime3);

        Period period = Period.between(localDate1,LocalDate.now());
        System.out.println(period);

        Duration duration = Duration.between(localTime3,LocalTime.now());
        System.out.println(duration);

    }
}
