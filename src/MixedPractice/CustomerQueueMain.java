package MixedPractice;

import java.util.LinkedList;
import java.util.List;

public class CustomerQueueMain {

List<String> customers = new LinkedList<>();

public void addCustomer(String name){
    customers.add(name);
    System.out.println("✅ Added: " + name);
}

    public void serveCustomer() {
        if (!customers.isEmpty()) {
            String served = customers.removeFirst();
            System.out.println("👋 Served: " + served);
        } else {
            System.out.println("⚠️ No customers left!");
        }
    }

public void showQueue(){
    int count = 1;
    System.out.println("\uD83D\uDCCB Queue:  ");
    for (String e : customers){
        System.out.println(count + ". " + e);
        count++;
    }

}


}
