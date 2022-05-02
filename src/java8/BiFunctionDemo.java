package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);

        Predicate<Integer> predicate = p -> p % 2 == 0;

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> biFunction = (list1,predicate1) -> {
            List<Integer> result = new ArrayList<>();

            for (Integer i : list1) {
                if (predicate1.test(i)) {
                    result.add(i);
                }
            }
            return result;
        };
        biFunction.apply(list, predicate).stream().toList().forEach(System.out::println);
    }
}
