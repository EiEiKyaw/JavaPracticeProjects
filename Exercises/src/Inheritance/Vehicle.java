package Inheritance;

///////For  Constructor3///////////
// public class Vehicle {
//     String name;
//     Vehicle(String name){
//         this.name = name;
//     }

//     void vehicleType(){
//         System.out.println(name + "is in garage");
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////For  Constructor2///////////
public class Vehicle {
    String name;
    int count;
    
    public Vehicle(String name){
        this.name = name;
    }
    
    public Vehicle(String name, int count){
        this.name = name;
        this.count = count;
    }

    void vehicalType(){
        
    }
}