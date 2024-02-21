package Inheritance.Constructor;

public class Main {

    
    public static void main(String[] args) {
        Wheel c1 = new Wheel("wheel");
        Car c2 = new Car("car");
        System.out.println(c2);
        System.out.println(c1);

        c2.go();
        c1.brake();
        c2.store();
    }
}

class Vehicle{
    String vName;

    Vehicle(String vName) {
        this.vName = vName;
    }

    void store() {
        System.out.println("Vehicle is in garage");
    }
}

class Car extends Vehicle{
    String cName;
    Car(String cName) {
        super(cName);
    }
    void go(){
        System.out.println("Moving Forward " + vName);
    }

    public String toString() {
        return "This is " + vName;
    }
}

class Wheel extends Car {

    Wheel(String cwheel) {
        super(cwheel);
    }
    
    public String toString(){
        return "Car has four " + vName;
    }

    void brake() {
        System.out.println("Stop");
    }

}
