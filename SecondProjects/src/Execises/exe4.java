package Execises;

interface Walkable{
	public void Walk();
}

interface Swimmable{
	public void Swim();
}

class Duck implements Walkable, Swimmable{
	public void Walk() {
		System.out.println("Duck is walking.");
	}
	public void Swim() {
		System.out.println("Duck is swimming."); 
	}
}


public class exe4 {

	public static void main(String[] args) {
		Duck Obj = new Duck();
		Obj.Walk();
		Obj.Swim();

	}

}
