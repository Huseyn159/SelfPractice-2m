package MixedPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class VisitedCityTracker {
    Set<String> cities = new LinkedHashSet<>();

    public void setCities(String name) {
        if (cities.add(name)) { // true = added successfully
            System.out.println("🏙️ City added: " + name);
        } else {
            System.out.println("⚠️ " + name + " already visited!");
        }

    }

    public void removeCity(String name){
        if (cities.remove(name)) {
            System.out.println("❌ Removed: " + name);
        } else {
            System.out.println("⚠️ City not found: " + name);
        }
    }

    public void visitedCities(){
        System.out.println("✈️ Visited cities:");
        for (String a : cities) {
            System.out.println(" - " + a);


        }
    }
}
