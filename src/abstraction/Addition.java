package abstraction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Addition  {

    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void sub(int i, int j) {

    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(6,7);

    }
}
