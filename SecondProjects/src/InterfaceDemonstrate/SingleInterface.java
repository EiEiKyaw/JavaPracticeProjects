package InterfaceDemonstrate;

interface Animal{
	void eat();
	void sound();
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog ate bone.");
	}

	@Override
	public void sound() {
			System.out.println("Dog make Woo woo!!!.");
	}	
}


public class SingleInterface {

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		dogObj.eat();
		dogObj.sound();

	}

}
