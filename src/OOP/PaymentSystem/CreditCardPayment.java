package OOP.PaymentSystem;

public class CreditCardPayment extends Payment {
    int cardNumber;
    String cardHolder;

    public CreditCardPayment(double amount, String currency, int cardNumber, String cardHolder) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }


    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Paid via Credit Card (" + cardHolder +") ");
    }
}
