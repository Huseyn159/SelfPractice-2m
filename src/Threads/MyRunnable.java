package Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " runnig " + i);
            try{
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error! " + e);
            }
        }
    }
}
