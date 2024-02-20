package Inheritance.Constructor3;

 public class Car extends Vehicle {
     int cCount;
     Car(String cName, int cCount){
         super(cName);
         this.cCount = cCount;
     }

     void noOfCar() {
         super.vehicleStore();
         System.out.println(cCount +" "+ vName+"s"+ "can be found in garage");
 }
}