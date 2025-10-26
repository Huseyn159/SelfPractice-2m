package OOP.CarOOP;
import java.util.ArrayList;
public class Garage {

    private ArrayList<Car> cars;

    public Garage(){
        cars = new ArrayList<>();
    }


    //Masin elave etmek
    public void addCar(Car car){
        cars.add(car);
        System.out.println(car.model + " added to garage.");
    }

    //Butun masinlari gostermek
    public void showAllCars(){
        System.out.println("\n🚗 Garage Inventory:");
        for(Car car:cars){
            car.displayInfo();
            System.out.println("----------------------");
        }
    }
}
