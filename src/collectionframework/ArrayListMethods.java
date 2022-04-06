package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(56);
        list1.add(33);
        list1.add(77);

        Collections.sort(list1,Collections.reverseOrder());

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(56);
        list2.add(44);
        list2.add(45);

//        System.out.println(list1.addAll(list2));
//        System.out.println(list1.removeAll(list2));
//        System.out.println(list1.retainAll(list2));
        System.out.println(list1);

//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(10));
//        System.out.println(list.get(3));
//        System.out.println(list.indexOf(77));
//        System.out.println(list.isEmpty());
//        list.clear();


    }
}
