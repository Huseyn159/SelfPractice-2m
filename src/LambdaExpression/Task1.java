package LambdaExpression;

import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate<Integer> pr = a -> a>0 && (a%2)==0  ;


        System.out.println(pr.test(4));
    }



}
