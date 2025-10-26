package GenericClassPractice;

public class GenericFinder {

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 6, 9, 4, 2, 3};

        System.out.println(finder(arr, 5));
        System.out.println(finder(arr, 10));

        String[] words = {"Java", "Python", "C++"};
        System.out.println(finder(words, "Python"));
        System.out.println(finder(words, "Rust"));
    }
    public static <T> boolean finder(T[] array, T value){

        for(T e :array){
            if(e.equals(value)){
              return true;

            }

        }
        return false;
    }
}
