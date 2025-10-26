package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EDED DAXIL EDIN: ");
        String num = sc.nextLine();
        Stack <Character> stack = new Stack<>();


        for(char c : num.toCharArray()){

            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        int n = Integer.parseInt(reversed.toString());

        System.out.println(n);






    }
}
