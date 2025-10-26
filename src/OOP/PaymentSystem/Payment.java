package OOP.PaymentSystem;

public abstract class Payment {

    double amount;
    String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void processPayment(){

    }

    public void showDetails(){

    }


}
