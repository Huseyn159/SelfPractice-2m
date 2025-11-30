package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(3,7,10,15,20,25);

        List<Integer> netice = list.stream()
                .filter(n -> (n%2) == 0 && n>10)
                .collect(Collectors.toList());


        System.out.println(netice);
    }

}
