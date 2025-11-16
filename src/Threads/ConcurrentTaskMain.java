package Threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentTaskMain {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        ConcurThread1 t1 = new ConcurThread1(map);
        ConcurThread2 t2 = new ConcurThread2(map);
        ConcurThread3 t3 = new ConcurThread3(map);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
