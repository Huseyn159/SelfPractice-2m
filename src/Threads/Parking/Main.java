package Threads.Parking;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot p1 = new ParkingLot();

        Car t1 = new Car(p1);
        Car t2 = new Car(p1);
        Car t3 = new Car(p1);
        Car t4 = new Car(p1);
        Car t5 = new Car(p1);
        Car t6 = new Car(p1);
        Car t7 = new Car(p1);
        Car t8 = new Car(p1);
        Car t9 = new Car(p1);
        Car t10 = new Car(p1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();

        System.out.println("Parking process completed!");







    }
}
