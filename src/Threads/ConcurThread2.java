package Threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurThread2 extends Thread{
    private ConcurrentHashMap<String,Integer> a;

    public ConcurThread2(ConcurrentHashMap<String, Integer> a) {
        this.a = a;
    }

    public void run(){
        for (int i = 0; i <= 10; i++) {
            a.put("B" + i,i);
            System.out.println(Thread.currentThread().getName() + " added: B" + a.get("B" + i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
