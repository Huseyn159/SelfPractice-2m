package OOP.CarOOP;

public class E_Car_Main {
    public static void main(String[] args) {
        ElecticCar tesla = new ElecticCar("Tesla", 200, "Model S", 2023, 100, 80);
        tesla.displayInfo();
        tesla.charge();
        tesla.displayInfo();


}
    }
