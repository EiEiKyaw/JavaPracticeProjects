package Inheritance.Constructor3;

 public class Vehicle {
     String vName;
     Vehicle(String vName){
         this.vName = vName;
     }

     void vehicleStore(){
         System.out.println(vName + "is in garage");
     }
 }
