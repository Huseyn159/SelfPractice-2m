package Threads.Traffic_Intersection;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight tr = new TrafficLight();
        TrafficLightController controller = new TrafficLightController(tr);
        controller.start();

        for (int i = 1; i <= 10; i++) {
            new CarNS(tr, "NS-Car-" + i).start();
            Thread.sleep(500);
        }

        for (int i = 1; i <= 10; i++) {
            new CarEW(tr, "EW-Car-" + i).start();
            Thread.sleep(500);
        }
    }
}







