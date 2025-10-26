package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        String input = sc.nextLine();


        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;

                } else {
                    stack.pop();
                }

            }
        }

        if (isBalanced && stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
