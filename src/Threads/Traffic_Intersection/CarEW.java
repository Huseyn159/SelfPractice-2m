package Threads.Traffic_Intersection;

public class CarEW extends Thread {

    private TrafficLight trafficLight;
    private String carName;

    public CarEW(TrafficLight tr, String name) {
        this.trafficLight = tr;
        this.carName = name;
    }

    @Override
    public void run() {
        try {
            trafficLight.passEW(carName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

