package GenericClassPractice;

public class DoubleBoxMain {
    public static void main(String[] args) {
        DoubleBox<String> box1 = new DoubleBox<>("Hello","World");
        box1.print();
        box1.swap();
        box1.print();
    }
}
