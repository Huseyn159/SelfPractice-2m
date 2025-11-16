package Threads.AirportRunwayManagement;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();
        Runway runway = new Runway();
     ;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(rnd.nextInt(600));
            TakeoffPlane off = new TakeoffPlane(runway,"TakeOffPlane-" + i);
            off.start();

        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(rnd.nextInt(600));
            LandingPlane landingPlane = new LandingPlane(runway,"LandingPlane-"+i);
            landingPlane.start();

        }

    }
}
