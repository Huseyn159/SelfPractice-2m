package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int count;
        for(int i = 0; i< input.length();i+=2){
            if (i+1<input.length()){
            stack.push(input.toCharArray()[i+1]);}
            stack.push(input.toCharArray()[i]);

        }

        System.out.println(stack);


    }
}
