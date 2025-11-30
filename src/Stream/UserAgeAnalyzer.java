package Stream;

import java.util.List;

public class UserAgeAnalyzer {

    public static void main(String[] args) {

        List<Integer> ages = List.of(12,18,25,30,17,40);


        ages.stream()
                .filter(n->n>18)
                .map(n->n*n)
                .forEach(System.out::println);




    }




}
