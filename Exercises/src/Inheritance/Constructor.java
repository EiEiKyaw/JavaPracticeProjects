package Inheritance;

public class Constructor {

    
    public static void main(String[] args) {
        Wheel c1 = new Wheel("wheel");
        Car1 c2 = new Car1("car");
        System.out.println(c2);
        System.out.println(c1);

        c2.go();
        c1.brake();
        c2.store();
    }
}

class Vehical{
    String name;

    Vehical(String name) {
        this.name = name;
    }

    void store() {
        System.out.println("Vehical is in garage");
    }
}

class Car1 extends Vehical{
    String cname;
    Car1(String cname) {
        super(cname);
    }
    void go(){
        System.out.println("Moving Forward " + name);
    }

    public String toString() {
        return "This is " + name;
    }
}

class Wheel extends Car1 {

    Wheel(String cwheel) {
        super(cwheel);
    }
    
    public String toString(){
        return "Car has four " + name;
    }

    void brake() {
        System.out.println("Stop");
    }

}
