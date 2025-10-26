package GenericClassPractice;

public class NumberBoxMain {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.addNumbers(2);
        intBox.addNumbers(6);
        intBox.addNumbers(3);
        System.out.println(intBox.getSum());


        //NumberBox<String> stringNumberBox =new NumberBox<>() bu ishlemeyecek


        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.addNumbers(2.6);
        doubleBox.addNumbers(63.6);
        doubleBox.addNumbers(85.6);

        System.out.println(doubleBox.getSum());
    }
}
