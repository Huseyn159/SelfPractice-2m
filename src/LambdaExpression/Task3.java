package LambdaExpression;

import java.util.function.Consumer;

public class Task3 {
    public static void main(String[] args) {

        Consumer<String> cn = a -> System.out.println(a.trim().toUpperCase());

cn.accept("helllo world fan fin foUn");
    }
}
