package MixedPractice;

public class ProductMain {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(232,"Apple",0.99));
        manager.addProduct(new Product(232,"SameApple",1.99));
        manager.addProduct(new Product(1,"Bread",0.79));
        manager.addProduct(new Product(2,"Water",0.89));

        manager.showAll();
        manager.removeProduct(new Product(1,"Bread",0.79));
   manager.showAll();



    }




}
