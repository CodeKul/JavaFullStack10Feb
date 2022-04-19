package interviewquestions;

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

        String str = "I am Developer and also Engineer";

        String[] strings = str.split(" ");

        for (int i= strings.length-1;i>=0;i--){
            System.out.print(strings[i]+ " ");
        }
    }
}
