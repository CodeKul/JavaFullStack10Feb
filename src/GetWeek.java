import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class GetWeek {
    public static void main(String[] args) {

        Calendar ca1 = Calendar.getInstance();
        Date date =  toDate(LocalDate.now());
        ca1.setTime(date);
        ca1.setMinimalDaysInFirstWeek(1);
        int wk = ca1.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Week of Month :" + wk);
    }
    public static Date toDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
}
