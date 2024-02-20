package InterfaceDemonstrate;

interface Flyable{
	void fly();
	void sound();
}

interface Swimmmable{
	void swim();
}
       
class Duck implements Flyable, Swimmmable{

	@Override
	public void swim() {
		System.out.println("Duck is swimming.");
	}
	
	@Override
	public void sound() {
		System.out.println("Duck make quack quack!!.");
		
	}
	

	@Override
	public void fly() {
		System.out.println("Duck is flying.");
	}
}

public class MultiInterface {

	public static void main(String[] args) {
		Duck duckObj = new Duck();
		duckObj.fly();
		duckObj.sound();
		duckObj.swim();

	}

}
