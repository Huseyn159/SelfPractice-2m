package Threads.RestaurantOrderRequest;

public class CustomerOrder implements Runnable{
    private String customerName;
    private String burgerName;
    private Grill grill;

    public CustomerOrder(String customerName, String burgerName, Grill grill) {
        this.customerName = customerName;
        this.burgerName = burgerName;
        this.grill = grill;
    }

    @Override
    public void run() {
     synchronized (grill){
         System.out.println(Thread.currentThread().getName() + " grill-i istifade edir...");
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

         System.out.println(Thread.currentThread().getName() + " grill-i bosaltdi...");

     }

        System.out.println(Thread.currentThread().getName() + " corek ve sousu hazirlayir...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " burgeri yigir...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + "-nin " + burgerName + " burgeri hazirdir!" );
    }
}
