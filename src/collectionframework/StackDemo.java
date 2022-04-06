package collectionframework;

import java.util.Stack;
import java.util.Vector;

public class StackDemo extends Vector{



    public static void main(String[] args) {
//
//        StackDemo obj = new StackDemo();
//        obj.

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());
        System.out.println(stack.search(10));
        System.out.println(stack);
    }
}
