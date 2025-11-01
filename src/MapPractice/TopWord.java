package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopWord {
    public static void main(String[] args) {
        Map<String,Integer> counter = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence");
        String sentence = sc.nextLine();

        if (sentence.trim().isEmpty()) {
            System.out.println("Sentence is empty!");
            return;
        }

        for (String word : sentence.toLowerCase().split(" ")){

            counter.put(word, counter.getOrDefault(word,0)+1);

        }

        int maxValue = 1;
        String maxVKEY = " ";

        for (Map.Entry<String,Integer> entry : counter.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxVKEY = entry.getKey();
            }
        }
        System.out.println("Most frequent word: " + maxVKEY +" (" + counter.get(maxVKEY) + " times)");




    }
}
