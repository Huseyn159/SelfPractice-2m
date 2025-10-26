package OOP.CarOOP;

public class Truck extends Car{

    int loadCapacity;
    int currentLoad;

    public Truck(String brand, int speed, String model, int year, int loadCapacity, int currentLoad) {
        super(brand, speed, model, year);
        this.loadCapacity = loadCapacity;
        this.currentLoad = currentLoad;
    }


    public void load(int kq){

        if(currentLoad+kq<=loadCapacity){
            currentLoad+=kq;
            System.out.println("Loaded...");
        }
        else {
            System.out.println("Truck is full");
        }

    }
    public void unload(int kq){

        if(currentLoad>=0){
            currentLoad-=kq;
            System.out.println("Unloaded...");
        }
        else {
            System.out.println("Truck is empty");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " Current Load: " + currentLoad);
    }
}
