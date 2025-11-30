package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {


    List<Integer> prices = List.of(120, 80, 300, 40, 200);

   List<Double> result = prices.stream()
           .filter(n -> n>100)
           .map(n-> n*1.18)
           .collect(Collectors.toList());


        System.out.println(result);

    }

}
