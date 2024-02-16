package Inheritance;

///////For  Constructor3///////////
// public class Vike extends Vehicle {
//     int bCount;
//     Vike(String name, int bCount) {
//         super(name);
//         this.bCount = bCount;
//     }
//
//     void noOfBike() {
//         super.vehicleType();
//         System.out.println(bCount +" "+ name+"s"+ "can be found in garage");
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////For  Constructor2///////////

public class Vike extends Vehicle {
	String bName;
	int bCount;

	public Vike(String name, int cCount, String bName, int bCount) {
		super(name, cCount);
		this.bName = bName;
		this.bCount = bCount;
	}

	public Vike(String name, int count) {
		this.bName = name;
		this.count = count;
	}

	void noOfBike() {
		super.vehicalType();
		{
			System.out.println(bName + " is in garage");
		}
		System.out.println(bCount + " " + bName + "s " + "can be found in garage");
	}

	void noOfCar() {
		super.noOfCar(); // This calls noOfCar method from the car class
	}
}