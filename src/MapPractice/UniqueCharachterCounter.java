package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharachterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word:");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        Map<Character,Integer> characterIntegerMap = new HashMap<>();


        for(char c : arr){
            characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);

        }
//        System.out.println(characterIntegerMap);

//        for(Map.Entry<Character,Integer> entry : characterIntegerMap.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        characterIntegerMap.forEach((k,v) -> System.out.println(k + " -> " + v));

    }
}
