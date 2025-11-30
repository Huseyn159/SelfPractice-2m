package Stream;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        List<String> names = List.of("ali", "veli", "elvin");


        names.stream()
                .map(n-> n.toUpperCase() + "!")
                .forEach(System.out::println);



    }
}
