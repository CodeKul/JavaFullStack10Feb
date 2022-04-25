package java8;

/**
 * lambada exp-> is anonymous function
 *
 * ()->{ body }
 *
 * use - it take less code
 *       it implements functional interface
 *
 */
public class LambadaExpression {

    public void show(){

    }
    public static void main(String[] args) {

        MyInterface myInterface = ()-> {
                System.out.println("in add method");
        };

        myInterface.add();
    }
}

@FunctionalInterface
interface MyInterface{

    void add();
}