package multithreading;

public class YeildDemo extends Thread {


    @Override
    public void run() {
        Thread.yield();
        //it pause the current thread execution and give chance to another thread
        for (int i=1;i<5;i++){
            System.out.println("IN run method");
        }
    }

    public static void main(String[] args) {

        YeildDemo obj = new YeildDemo();
        obj.start();

        for (int i=1;i<5;i++){
            System.out.println("main method");
        }

    }
}
