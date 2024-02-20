package Inheritance.Constructor2;


public class Car extends Vehicle {
    int cCount;
    Car(String cName, int cCount){
        super(cName);
        this.cCount = cCount;
    }

    void noOfCar() {
        super.vehicalStore();{
        System.out.println(vName + " is in garage");
        }
        System.out.println(cCount +" "+ vName+"s"+ " can be found in garage");
    }
}