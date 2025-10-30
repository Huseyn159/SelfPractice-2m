package MixedPractice;

import java.util.HashSet;
import java.util.Set;

public class ProductManager {
Set<Product> inventory = new HashSet<>();

public void addProduct(Product a){
    if (inventory.add(a))System.out.println("Product added: " + a);
    else System.out.println("Product already exists " + a);


}
public void removeProduct(Product a){

    if(inventory.remove(a)) System.out.println(a + " removed");
    else System.out.println("Product not found");
}

public void showAll(){
    System.out.println("PRODUCTS");
    System.out.println("--------");
    for (Product p : inventory){
        System.out.println("- " + p);

    }
}
}
