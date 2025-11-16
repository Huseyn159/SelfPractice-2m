package Threads.Producer_Consumer;
import java.util.LinkedList;
import java.util.List;

public class Table {
    private final List<String> foods = new LinkedList<>();
    private final int LIMIT = 5;


    public synchronized void produce(String food) throws InterruptedException {

        while (foods.size() == LIMIT) {
            System.out.println("Masa doludur. Chef gözləyir...");
            wait();
        }

        foods.add(food);
        System.out.println("Chef hazırladı: " + food);

        notifyAll();
    }


    public synchronized String consume() throws InterruptedException {

        while (foods.isEmpty()) {
            System.out.println("Masa boşdur. Waiter gözləyir...");
            wait();
        }

        String food = foods.remove(0);
        System.out.println("Waiter götürdü: " + food);

        notifyAll();
        return food;
    }
}
