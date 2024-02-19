package Work;

public class Cat extends Mannal {

	public Cat() {
		
	}
	
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}
	
	public String toString() {
		return "Cat[" + super.toString();
	}

}
