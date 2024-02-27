package WEEK3_Exercise.exercise3;

public class InterfaceInheritance implements Car {
	public void alert() {
		System.out.println("The car is ready to drive");
	}
	public void move() {
		System.out.println("Car is start moving");
	}
	public void stop() {
		System.out.println("Car is stopping");
	}
	public void turnLeft() {
		System.out.println("Car is turning left");
	}
	public void turnRight() {
		System.out.println("Car is turning right");
	}
	
	public static void main(String[] args) {
		InterfaceInheritance c1 = new InterfaceInheritance();
		
		c1.alert();
		c1.move();
		c1.turnLeft();
		c1.turnRight();
		c1.stop();
	}
}

interface FrontWheel{
	public void turnLeft();
	public void turnRight();
}

interface Engine extends FrontWheel{
	public void move();
	public void stop();
}

interface Car extends Engine{
	public void alert();
}
