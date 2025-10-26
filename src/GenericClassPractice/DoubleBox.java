package GenericClassPractice;

public class DoubleBox <T>{
    private T first;
    private T second;

    public DoubleBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }
    public void print() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
