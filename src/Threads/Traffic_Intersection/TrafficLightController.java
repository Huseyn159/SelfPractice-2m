package Threads.Traffic_Intersection;


public class TrafficLightController extends Thread {

    private TrafficLight trafficLight;

    public TrafficLightController(TrafficLight tr) {
        this.trafficLight = tr;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (trafficLight) {
                trafficLight.nsGreen = !trafficLight.nsGreen;
                trafficLight.notifyAll();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
