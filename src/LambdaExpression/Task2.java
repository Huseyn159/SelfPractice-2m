package LambdaExpression;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {

        Function<String,Integer> fn = (a) -> {
            Integer b = 0;
            for (Character c : a.toLowerCase().toCharArray()){
                if (c == 'a'||c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                    b++;
                }
            }

          return b;
        };


    }
}
