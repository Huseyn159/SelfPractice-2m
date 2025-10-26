package OOP.CarOOP;

public class TruckMain {
    public static void main(String[] args) {
        Truck man = new Truck("MAN",120,"T-100",2025,1000,850);


        man.displayInfo();
        man.load(300);
        man.displayInfo();
        man.unload(250);
        man.displayInfo();
        man.load(300);
        man.accelerate();
        man.displayInfo();
    }
}
