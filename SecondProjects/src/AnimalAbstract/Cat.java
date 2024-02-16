package AnimalAbstract;

public class Cat extends Animals{

	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Cat[" + super.toString() + ']';
	}

	public void greeting() {
		System.out.println("Meow");
	}

}
