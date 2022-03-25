package multithreading;

public class MultithreadingDemo extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MultiDemo {

    public static void main(String[] args) {

        Thread hii = new Thread(()-> {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        });
        hii.start();

        Thread hello = new Thread(()-> {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        });
        hello.start();
    }
}