package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CapitalFinder {
    public static void main(String[] args) {

        Map<String,String> countries = new HashMap<>();
        countries.put("Japan","Tokyo");
        countries.put("Azerbaijan","Baku");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CAPITAL FINDER ===");
        System.out.println("1️⃣  Find country by capital");
        System.out.println("2️⃣  Find capital of country");
        System.out.print("Choose: ");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean notFounded = true;
        switch (choice){
            case 1 ->{
                System.out.println("📍 Enter capital city:");
                String capital = sc.nextLine().trim();

                 for (Map.Entry<String,String> entry : countries.entrySet()){
                     if (entry.getValue().equalsIgnoreCase(capital)){

                         System.out.println("🏙️ " + entry.getValue() + " is capital city of " + entry.getKey());
                          notFounded = false;
                     }

                 }
                if (notFounded) System.out.println("❌ Sorry! Country not found");
                }


            case 2 ->{
                System.out.println("Enter country");
                String country = sc.nextLine().trim();
//                if (countries.containsKey(country)) {
//                    System.out.println("Capital of " + country + " is " + countries.get(country));
//
//                }
//                else {
//                    System.out.println("Sorry!Country not found");
//                }
                for(Map.Entry<String,String> entry : countries.entrySet()){
                    if (entry.getKey().equalsIgnoreCase(country)){
                        System.out.println("🏙️ Capital of " + entry.getKey() + " is " + entry.getValue());
                        notFounded = false;
                    }


                }
                if (notFounded) System.out.println("❌ Sorry! Country not found");

            }
            default -> System.out.println("Invalid choice!");
        }




    }
}
