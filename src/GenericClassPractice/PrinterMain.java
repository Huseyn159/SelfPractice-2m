package GenericClassPractice;

public class PrinterMain {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Java", "Python", "C++"};
        Double[] decimals = {1.1, 2.2, 3.3};

        printArray(numbers,"Number");
        System.out.println("----");
        printArray(words,"Words");
        System.out.println("----");
        printArray(decimals,"Decimals");
    }
    public static <E> void printArray(E[] array,String title){
        System.out.println(title);
        for(E element : array){

            System.out.println(element);
        }


    }
}
