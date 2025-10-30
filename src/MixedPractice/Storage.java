package MixedPractice;

import java.util.HashSet;
import java.util.Set;

public class Storage <T>{
    Set<T> item = new HashSet<>();

    public void addItem(T e){
        if (item.add(e)){
            System.out.println("Item added: " + e);
        }
        else {
            System.out.println("Item already exists! ");
        }
    }

    public void removeItem(T e){
        if (item.remove(e)){
            System.out.println("Item removed: " + e);

        }
        else {
            System.out.println("Item not founded");
        }
    }

    public void showItems(){
        System.out.println("Items:");
        for (T e : item){
            System.out.println("- " + e);
        }
    }
}
