package lesson6;

public class Car {
    //1. fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public Car(int price, int yearOfManufacturing, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }

    //2.Constructors


    //3.Methods
    void startRun() {
        System.out.println("I'm running...");
    }

    void stopRun() {
        System.out.println("I am stopping...");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }
}
