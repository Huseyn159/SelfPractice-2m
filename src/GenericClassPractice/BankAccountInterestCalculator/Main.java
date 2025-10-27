package GenericClassPractice.BankAccountInterestCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BusinessAccount businessAccount = new BusinessAccount(8999.99,"MSI");
        StudentAccount studentAccount = new StudentAccount(199.99,"BDU","Hasan");
        SavingsAccount savingsAccount = new SavingsAccount(5999.99,"Ekrek");

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(businessAccount);
        accounts.add(savingsAccount);
        accounts.add(studentAccount);
        System.out.println("Total interests of all accounts: " + InterestService.totalInterest(accounts));


    }
}
