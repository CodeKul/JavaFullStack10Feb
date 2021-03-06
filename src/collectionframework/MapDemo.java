package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ABC");
        map.put(2,"PQR");
        map.put(3,"XYZ");

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
//        System.out.println(map);

        for (Integer entry:map.keySet()) {
            System.out.println(entry+" "+map.get(entry));
        }
    }
}
