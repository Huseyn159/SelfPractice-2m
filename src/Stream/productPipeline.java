package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class productPipeline {
    public static void main(String[] args) {

        List<Double> prices = List.of(50.0, 120.0, 300.0, 80.0);

        List<Double> son = prices.stream()
                .filter(n->n>100)
                .map(n-> n-(n*0.2))
                .toList();


       son.forEach(a-> System.out.println("Final price: " + a));





    }


}
