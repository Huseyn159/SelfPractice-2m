package Threads.Parking;

public class Car extends Thread{
    ParkingLot parkingLot = new ParkingLot();

    public Car(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void run() {
        try {
            parkingLot.enter(getName());
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        parkingLot.leave(getName());

    }
}
