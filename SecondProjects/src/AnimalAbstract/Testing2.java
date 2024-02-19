package AnimalAbstract;

class AnimalClass{
	String name;
	
	public AnimalClass(String name) {
		this.name = name;
	}
}


class Dog1 extends AnimalClass{
	public Dog1(String name) {
		super(name);
	}
	
	public void Greeks() {
		System.out.println("Wooof!");
	}
	
	public String toString() {
		return "Dog name: " + name;
	}
}


class Cat1 extends Dog1{

	public Cat1(String name) {
		super(name);
	}
	
	public void Greeks() {
		System.out.println("Meow!");
	}

	public String toString() {
		return "Cat name: " + name;
	}
}


public class Testing2 {

	public static void main(String[] args) {
		Dog1 dogObj = new Dog1("Noki");
		System.out.println(dogObj);
		dogObj.Greeks();
		
		
		Cat1 catObj = new Cat1("Shwe War");
		System.out.println(catObj);
		catObj.Greeks();	
	}

}
