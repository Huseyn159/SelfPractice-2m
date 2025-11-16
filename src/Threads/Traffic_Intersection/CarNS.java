package Threads.Traffic_Intersection;

public class CarNS extends Thread {

    private TrafficLight trafficLight;
    private String carName;

    public CarNS(TrafficLight tr, String name) {
        this.trafficLight = tr;
        this.carName = name;
    }

    @Override
    public void run() {
        try {
            trafficLight.passNS(carName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
