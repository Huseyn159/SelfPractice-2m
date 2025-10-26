package OOP.CarOOP;

public class GarageMain {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        Car bmw = new Car("BMW", 240, "M5", 2024);
        ElecticCar tesla = new ElecticCar("Tesla", 220, "Model S", 2023, 100, 90);
        Truck man = new Truck("MAN", 120, "T-100", 2025, 1000, 850);

        myGarage.addCar(bmw);
        myGarage.addCar(tesla);
        myGarage.addCar(man);
        man.accelerate();

        myGarage.showAllCars();  // Polymorphism
    }
}