package Threads.RestaurantOrderRequest;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Grill g = new Grill();

        CustomerOrder o1 = new CustomerOrder("Customer A", "Classic Burger", g);
        CustomerOrder o2 = new CustomerOrder("Customer B", "Chicken Burger", g);
        CustomerOrder o3 = new CustomerOrder("Customer C", "Double Beef Burger", g);

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Bütün burgerlər hazırdır! 🍔");


    }





}
