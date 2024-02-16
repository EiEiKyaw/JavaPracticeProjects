package Inheritance.Constructor2;


public class Car extends Vehicle {
    int cCount;
    Car(String name, int cCount){
        super(name);
        this.cCount = cCount;
    }

    void noOfCar() {
        super.vehicalType();{
        System.out.println(name + " is in garage");
        }
        System.out.println(cCount +" "+ name+"s"+ " can be found in garage");
    }
}