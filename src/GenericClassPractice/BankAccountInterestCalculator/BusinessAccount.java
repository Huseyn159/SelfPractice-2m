package GenericClassPractice.BankAccountInterestCalculator;

public class BusinessAccount extends BankAccount {
    private String companyName;

    public BusinessAccount(double balance, String companyName) {
        super(balance);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
