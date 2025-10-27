package GenericClassPractice.BankAccountInterestCalculator;

public class SavingsAccount extends BankAccount{
    private String username;

    public SavingsAccount(double balance, String username) {
        super(balance);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
