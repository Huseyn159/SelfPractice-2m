package OOP.CarOOP;

public class Car {

    String brand;
    String model;
    int year;
    int speed;

    public Car(String brand, int speed, String model, int year) {
        this.brand = brand;
        this.speed = speed;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    public void accelerate(){
        speed+=10;
    }

    public void brake(){
        speed-=10;
    }

    public void displayInfo(){
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}');
    }
}
