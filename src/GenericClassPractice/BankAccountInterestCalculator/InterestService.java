package GenericClassPractice.BankAccountInterestCalculator;

import java.util.List;

public class InterestService {

    public static double totalInterest(List<? extends BankAccount> accounts) {
        double total = 0;

        for (BankAccount e : accounts) {
            total += e.calculateInterest();
        }

        return total;
    }
}
