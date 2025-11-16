package Threads.AirportRunwayManagement;

public class TakeoffPlane extends Thread {
    private Runway runway;
    private String planeName;

    public TakeoffPlane(Runway runway, String planeName) {
        this.runway = runway;
        this.planeName = planeName;
    }


    @Override
    public void run() {
        try {
            runway.takeoff(planeName);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
