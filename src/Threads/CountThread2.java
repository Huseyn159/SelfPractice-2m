package Threads;

public class CountThread2 extends Thread {
    private Counter c ;

    public CountThread2(Counter c) {
        this.c = c;
    }

    public void run(){
        for (int i = 0; i < 1000; i++) c.increment();

    }
}
