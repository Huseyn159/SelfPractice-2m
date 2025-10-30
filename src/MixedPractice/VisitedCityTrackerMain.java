package MixedPractice;

public class VisitedCityTrackerMain {
    public static void main(String[] args) {
        VisitedCityTracker tracker = new VisitedCityTracker();
        tracker.setCities("Baku");
        tracker.setCities("Tokio");
        tracker.setCities("Oslo");
        tracker.setCities("Baku");

        tracker.visitedCities();
        tracker.removeCity("Tokio");
        tracker.removeCity("Paris");
        tracker.visitedCities();
    }
}
