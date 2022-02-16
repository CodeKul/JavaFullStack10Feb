package basic;

public class PSVMDemo {

    /**
     * public -> access modifier and jvm can access main method from outside
     * static -> without creating object of class jvm can invoke the method
     * void -> it returns nothing
     * main -> is identifier and jvm looks for main as entry point
     *
     * String[] -> parameter string of array or command line argument
     * args -> variable name
     */
     static public void main(String []test) {

        System.out.println(test[0]);
        System.out.println(test[1]);

    }

     static public String main(int []test) {

        System.out.println(test[0]);
        System.out.println(test[1]);
        return "Hello";
    }
}
