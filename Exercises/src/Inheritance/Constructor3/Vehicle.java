package Inheritance.Constructor3;

 public class Vehicle {
     String name;
     Vehicle(String name){
         this.name = name;
     }

     void vehicleType(){
         System.out.println(name + "is in garage");
     }
 }
