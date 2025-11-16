package Threads.Producer_Consumer;

public class Waiter extends Thread {

    private Table table;

    public Waiter(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            try {
                table.consume();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
