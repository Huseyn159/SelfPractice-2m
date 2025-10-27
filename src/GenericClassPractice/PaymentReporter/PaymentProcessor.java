package GenericClassPractice.PaymentReporter;

import java.util.List;

public class PaymentProcessor {

    public static void addPayments(List<? super Integer> arr){
        arr.add(100);
        arr.add(200);
        arr.add(300);

    }
}
