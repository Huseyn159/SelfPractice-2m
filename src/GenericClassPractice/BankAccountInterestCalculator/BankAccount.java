package GenericClassPractice.BankAccountInterestCalculator;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest(){
       double interest = balance * 0.2;
       return interest;
    }
}
