package Inheritance.Constructor3;

 public class Vike extends Vehicle {
     int bCount;
     Vike(String bName, int bCount) {
         super(bName);
         this.bCount = bCount;
     }

     void noOfBike() {
         super.vehicleStore();
         System.out.println(bCount +" "+ vName+"s"+ "can be found in garage");
     }
 }
