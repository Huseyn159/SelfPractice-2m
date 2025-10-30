package MixedPractice;

import java.util.HashSet;
import java.util.Set;

public class Exchange<T> {

    Set<T> items = new HashSet<>();

    public void addItem(T a){
        if (items.add(a)) {
            System.out.println("Added: " + a);
        } else {
            System.out.println("Item already exists: " + a);
        }
    }

    public void swapItems(T oldItem,T newItem){
        if(items.contains(oldItem)){
            items.remove(oldItem);
            items.add(newItem);
            System.out.println("-" + oldItem + " +" + newItem);
        }else {
            System.out.println("Item not found");
        }
    }


    public void showItems(){
        System.out.println("Items");
        for (T a : items){

            System.out.println("- " + a);
        }
    }
}
