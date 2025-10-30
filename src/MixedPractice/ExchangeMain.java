package MixedPractice;

public class ExchangeMain {
    public static void main(String[] args) {



        Exchange<String> exchange = new Exchange<>();

        exchange.addItem("Apple");
        exchange.addItem("Banana");
        exchange.addItem("Orange");

        exchange.showItems();

        exchange.swapItems("Banana", "Mango");
        exchange.swapItems("Kiwi", "Watermelon");

        exchange.showItems();


    }
}
