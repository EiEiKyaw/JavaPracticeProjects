package Inheritance.Constructor3;

 public class Car extends Vehicle {
     int cCount;
     Car(String name, int cCount){
         super(name);
         this.cCount = cCount;
     }

     void noOfCar() {
         super.vehicleType();
         System.out.println(cCount +" "+ name+"s"+ "can be found in garage");
 }
}