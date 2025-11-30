package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Task4 {
    public static void main(String[] args) {

        Supplier<List<Integer>> sp = () -> {
            List<Integer> list = new ArrayList<>();
            list.add((int) (Math.random() * 100));
            list.add((int) (Math.random() * 100));
            list.add((int) (Math.random() * 100));

            return  list;
        };
        List<Integer> list = sp.get();
        list.forEach(System.out::println);


    }}

