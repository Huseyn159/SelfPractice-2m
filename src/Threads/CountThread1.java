package Threads;

public class CountThread1 extends Thread{
 private Counter c;

    public CountThread1(Counter c) {
        this.c = c;
    }

    public void run(){
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}
