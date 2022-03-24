import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GetWeek {
    public static void main(String[] args) {

        String[] arr = {};

        List<String> list = new ArrayList<>();
        list.add("");

        System.out.println(list.size());
        System.out.println(arr.length);
//        Calendar ca1 = Calendar.getInstance();
//        Date date =  toDate(LocalDate.now());
//        ca1.setTime(date);
//        ca1.setMinimalDaysInFirstWeek(1);
//        int wk = ca1.get(Calendar.WEEK_OF_MONTH);
//        System.out.println("Week of Month :" + wk);
    }
    public static Date toDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
}
