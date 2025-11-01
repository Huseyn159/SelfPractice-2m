package MapPractice;

import java.util.Map;
import java.util.TreeMap;

public class Population {
    public static void main(String[] args) {
        Map<String,Integer> cities = new TreeMap<>();
        cities.put("Shaki", 63000);
        cities.put("Ganja", 340000);
        cities.put("Sumqayit", 410000);
        cities.put("Baku", 2300000);

        for (Map.Entry<String,Integer> entry : cities.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("\nCities with population > 1,000,000:");
        for (Map.Entry<String,Integer> entry : cities.entrySet()){
            if (entry.getValue()> 1_000_000){
                System.out.println("- " + entry.getKey());
            }
        }

    }
}
