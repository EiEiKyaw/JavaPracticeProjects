package Inheritance;

public class InterfaceWithST {
	public static void main(String[] args) {
		Avoid a = new Avoid();
		a.description();
		InstanceFood.food1();
		InstanceFood.food2();
		a.shouldAvoid();
	}
}

interface InstanceFood{
	default void description() {
		System.out.println("There are so many instance food nowadays.They are");
	}
	static void food1() {
		System.out.println("1. Noodles");
	}
	static void food2() {
		System.out.println("2. Jelly");
	}
}

class Avoid implements InstanceFood{
	public void shouldAvoid() {
		System.out.println("You should avoid!");
	}
}
