import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now();

        List<LocalTime> localTimes = Arrays.asList(localTime,localTime1);
        System.out.println(localTimes.contains(localTime));
    }
}
