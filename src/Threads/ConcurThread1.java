package Threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurThread1 extends Thread {
    private ConcurrentHashMap<String,Integer> a;

    public ConcurThread1(ConcurrentHashMap<String, Integer> a) {
        this.a = a;
    }

    public void run(){
        for (int i = 0; i <= 10; i++) {
            a.put("A" + i,i);
            System.out.println(Thread.currentThread().getName() + " added: A" + a.get("A" + i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
