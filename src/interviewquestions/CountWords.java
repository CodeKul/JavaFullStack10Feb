package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String str = "I am Developer Developer and I am also Engineer"
                .replaceAll("\\s","");

        String[] strings = str.split(" ");

        char[] chars = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (Character st:chars){
            if(map.containsKey(st)){
                map.put(st, map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        System.out.println(map.entrySet());
    }
}
