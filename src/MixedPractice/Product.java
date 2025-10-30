package MixedPractice;
import java.util.Objects;
public class Product {
    private int id;
    private  String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price: $" + price;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.id == other.id;

    }



}
