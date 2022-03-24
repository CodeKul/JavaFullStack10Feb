package multithreading;

public class MultithreadingDemo extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}

class MultiDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<5;i++){
            System.out.println("Hii");
        }
    }

    public static void main(String[] args) {
        MultiDemo obj = new MultiDemo();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}