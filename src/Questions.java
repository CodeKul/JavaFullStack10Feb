import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.stream.Stream;

public class Questions {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,12,8,14,16,7,51);

        for(int i = 1;i< list.size()-1;i++){
            if(list.get(i)< list.get(i+1) && list.get(i)< list.get(i-1)){
                System.out.println(list.get(i));
            }
        }

        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        i = scanner.nextInt();

        for(int j =1; j <=i;j++){

            if(isCube(j) || isSquare(j)){
                System.out.println(j);
            }
        }


    /*    int[] arr = {103, 23, 45, 545, 55, 101, 102};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0) + list.get(1));


        //2
        List<Integer> list1 = Stream.of(103, 23, 45, 545, 55, 101, 102).filter(f -> f > 100).sorted().toList();

        System.out.println(list1.get(0) + list1.get(1));
*/
//        LocalDate date =  LocalDate.parse("2022-03-15");
//        WeekFields weekFields = WeekFields.of(Locale.getDefault());
//        int weekNumber = date.get(weekFields.weekOfWeekBasedYear());
//        System.out.println(weekNumber);

    }

    private static boolean isSquare(int num)
    {
        int root = (int)Math.sqrt(num);
        return (root * root) == num;
    }

    private static boolean isCube(int num)
    {
        int root = (int)Math.cbrt(num);
        return (root * root *
                root) == num;
    }
}
