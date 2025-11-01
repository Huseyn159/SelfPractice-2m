package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String input = sc.nextLine();

        Map<String,Integer> counter = new HashMap<>();

        for (String word : input.split(" ")){

            counter.put(word,counter.getOrDefault(word,0)+1);

        }
//        System.out.println(counter);
//        for (Map.Entry<String,Integer> entry : counter.entrySet()){
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
         counter.forEach((k,v) -> System.out.println(k + "->" + v));


    }
}
