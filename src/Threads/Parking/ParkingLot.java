package Threads.Parking;

public class ParkingLot {

    int capacity = 3;
    int currentCars = 0;


    public synchronized void enter(String carName) throws InterruptedException {

        while (currentCars == capacity){
            System.out.println("ParkingLot is full!Please wait!");
            wait();
        }

        currentCars++;
        System.out.println(carName + " Parked");
        notifyAll();
    }

    public synchronized void leave(String carName){

        currentCars--;
        System.out.println(carName + " left parking");

        notifyAll();
    }



}
