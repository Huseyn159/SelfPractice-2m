package Threads;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CountThread1 t1 = new CountThread1(counter);
        CountThread2 t2 = new CountThread2(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Result = " + counter.count);
    }
}
