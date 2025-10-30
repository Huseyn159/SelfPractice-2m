package MixedPractice;


import java.util.LinkedList;
import java.util.List;

public class CustomerQueue {
    public static void main(String[] args) {

        CustomerQueueMain queue = new CustomerQueueMain();
        queue.addCustomer("Tofiq");
        queue.addCustomer("Cavad");
        queue.addCustomer("Hafiz");

        queue.showQueue();
        queue.serveCustomer();
        queue.showQueue();




    }

}
