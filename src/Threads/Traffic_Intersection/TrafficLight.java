package Threads.Traffic_Intersection;


public class TrafficLight {

    public boolean nsGreen = true;

    public synchronized void passNS(String carName) throws InterruptedException {
        while (!nsGreen) {
            wait();
        }
        System.out.println(carName + " moving North-South");
        Thread.sleep(1000);
    }

    public synchronized void passEW(String carName) throws InterruptedException {
        while (nsGreen) {
            wait();
        }
        System.out.println(carName + " moving East-West");
        Thread.sleep(1000);
    }
}
