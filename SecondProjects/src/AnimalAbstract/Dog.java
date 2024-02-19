package AnimalAbstract;

public class Dog extends Animals{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Dog[" + super.toString() + ']';
	}
	
	public void greeting() {
		System.out.println("Woof");
	}
	
	public void greeting(Dog another) {
		System.out.println("Wooooooof");
	}
	

}
