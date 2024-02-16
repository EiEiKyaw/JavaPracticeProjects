package Inheritance.Constructor3;

 public class Vike extends Vehicle {
     int bCount;
     Vike(String name, int bCount) {
         super(name);
         this.bCount = bCount;
     }

     void noOfBike() {
         super.vehicleType();
         System.out.println(bCount +" "+ name+"s"+ "can be found in garage");
     }
 }
