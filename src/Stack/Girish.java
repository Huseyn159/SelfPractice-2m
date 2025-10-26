package Stack;

//stack.push(meselen);
//stack.pop();
//stack.peek();
//stack.isEmpty();
//stack.size();

import java.util.Stack;

public class Girish {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Elave edirik
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(36);

        System.out.println(stack); //[10, 15, 20, 36]

        //en son giren yeni en ust element
        System.out.println("Top element: " + stack.peek());

        //Elemet cixarmaq.Bu en son elementi cixarir
        stack.pop();
        System.out.println(stack);

        //Bosh olmagini yoxlamaq ucun
        System.out.println("Empty? " + stack.isEmpty());

        //Olcusu
        System.out.println("Size: " + stack.size());
    }
}
