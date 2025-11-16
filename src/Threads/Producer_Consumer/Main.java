package Threads.Producer_Consumer;

public class Main {
    public static void main(String[] args) {

        Table table = new Table();

        Chef chef = new Chef(table);
        Waiter waiter1 = new Waiter(table);
        Waiter waiter2 = new Waiter(table);

        chef.start();
        waiter1.start();
        waiter2.start();
    }
}

