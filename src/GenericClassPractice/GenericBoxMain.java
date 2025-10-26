package GenericClassPractice;

public class GenericBoxMain   {
    public static void main(String[] args) {
      GenericBox<String> stBox = new GenericBox<>();
      stBox.setValue("Salam Generic");
      System.out.println("String box: " + stBox.getValue());

      GenericBox<Integer> intBox = new GenericBox<>();
      intBox.setValue(5);
        System.out.println("Integer box: " + intBox.getValue());

      GenericBox<Double> doubleGenericBox = new GenericBox<>();
      doubleGenericBox.setValue(2.36);
        System.out.println("Double Box: " + doubleGenericBox.getValue());

    }
}
