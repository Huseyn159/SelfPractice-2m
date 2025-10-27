package GenericClassPractice.PaymentReporter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> arr1 = new ArrayList<>();
        PaymentProcessor.addPayments(arr1);
        System.out.println(arr1);
    }
}
