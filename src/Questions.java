import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {103, 23, 45, 545, 55, 101, 102};

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

    }
}
