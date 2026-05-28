class MyRunnable implements Runnable {
    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for(int i =1;i<=5;i++) {
            System.out.println(name + " is running - Count: " + i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));
        t1.start();
        t2.start();
    }
}