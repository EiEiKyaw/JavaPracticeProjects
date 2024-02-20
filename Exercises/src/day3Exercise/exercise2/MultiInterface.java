package day3Exercise.exercise2;

public class MultiInterface {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.move();
		c1.turnLeft();
		c1.turnRight();
		c1.stop();
	}
}

interface Engine{
	public void move();
	public void stop();
}

interface FrontWheel{
	public void turnLeft();
	public void turnRight();
}

class Car implements Engine, FrontWheel{
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
}