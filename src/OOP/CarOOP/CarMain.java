package OOP.CarOOP;

public class CarMain  {

    public static void main(String[] args) {
        Car e_class = new Car("Mercedes",250,"E-Class",2025);
        Car c_class = new Car("Mercedes",250,"C-Class",2025);

        e_class.displayInfo();
        c_class.accelerate();
        c_class.displayInfo();
    }
}
