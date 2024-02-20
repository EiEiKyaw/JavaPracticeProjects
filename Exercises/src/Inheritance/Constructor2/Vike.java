package Inheritance.Constructor2;


public class Vike extends Car {
    String bName;
    int bCount;
    Vike(String name, int cCount, String bName, int bCount) {
        super(name, cCount);
        this.bName = bName;
        this.bCount = bCount;
    }

    void noOfBike() {
        super.vehicalStore();{
            System.out.println(bName + " is in garage");
        }
        System.out.println(bCount +" "+ bName+"s "+ "can be found in garage");
    }

    void noOfCar() {
        super.noOfCar(); // This calls noOfCar method from the car class
    }
}