package OOP.CarOOP;

public class ElecticCar extends Car{
     int batteryCapacity;
     int chargeLevel;

    public ElecticCar(String brand, int speed, String model, int year, int batteryCapacity, int chargeLevel) {
        super(brand, speed, model, year);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }



    public void charge(){
        chargeLevel+=10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("BatteryLevel: " + batteryCapacity + " ChargeLevel: " +chargeLevel);
    }
}
