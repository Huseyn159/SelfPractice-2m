package Threads.Producer_Consumer;

public class Chef extends Thread {

    private Table table;

    public Chef(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        int counter = 1;

        while (true) {
            try {
                table.produce("Food #" + counter);
                counter++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
