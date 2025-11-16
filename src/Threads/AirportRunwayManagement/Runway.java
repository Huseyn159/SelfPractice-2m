package Threads.AirportRunwayManagement;

public class Runway {

    boolean isFree = true;

    public synchronized void land(String planeName) throws InterruptedException {

        while (!isFree){
            System.out.println("Runway is full!");
            wait();
        }

        isFree = false;
        System.out.println(planeName + " is landing...");
        Thread.sleep(1000);
        System.out.println(planeName + " landed successfully");
        isFree=true;
        notifyAll();


    }

    public synchronized void takeoff(String planeName) throws InterruptedException {

        while (!isFree){
            System.out.println("Runway is full!");
            wait();
        }

        isFree=false;
        System.out.println(planeName + " is taking off..");
        Thread.sleep(1000);
        System.out.println(planeName + " took off!");
        isFree = true;
        notifyAll();


    }




}
