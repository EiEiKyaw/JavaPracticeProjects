package Execises;

interface Walkable{
	public void walk();
}

interface Swimmable{
	public void swim();
}

class Duck implements Walkable, Swimmable{
	public void walk() {
		System.out.println("Duck is walking.");
	}
	public void swim() {
		System.out.println("Duck is swimming."); 
	}
}


public class exe4 {

	public static void main(String[] args) {
		Duck obj = new Duck();
		obj.walk();
		obj.swim();

	}

}
