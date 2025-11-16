package Threads.AirportRunwayManagement;

public class LandingPlane extends Thread{
    private Runway runway;
    private String planeName;

    public LandingPlane(Runway runway, String planeName) {
        this.runway = runway;
        this.planeName = planeName;
    }


    @Override
    public void run() {
        try {
            runway.land(planeName);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
