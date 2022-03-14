package controlflowstatements;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WhileLoop {
    public static void main(String[] args) {

//        int i=0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<=10);
        LocalTime localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));

    }
}
