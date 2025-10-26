package Stack;

import java.util.Stack;

public class Taks1 {
    public static void main(String[] args) {
      String text = "HELLO";

      Stack<Character> stack = new Stack<>();



      for (char c : text.toCharArray()){

          stack.push(c);

      }

      StringBuilder reversed = new StringBuilder();


      while (!stack.isEmpty()){
          reversed.append(stack.pop());
      }

        System.out.println(reversed.toString());


    }
}
