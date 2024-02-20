package InterfaceDemonstrate;

interface Animal1{
	void eat();
	void sleep();
}

interface Pet extends Animal1{
	void play();
	void sound();
}

class Cat implements Pet{

	@Override
	public void eat() {
		System.out.println("Cat is eating.");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping. Zzzzz!");
	}

	@Override
	public void play() {
		System.out.println("Cat is playing.");
	}
	
	@Override
	public void sound() {
		System.out.println("Cat make sound Meow!!");
	}
	
}


public class InterfaceInheritanceDemo {
	public static void main(String[] args) {
		Cat catObj = new Cat();
		catObj.eat();
		catObj.sleep();
		catObj.play();
		catObj.sound();

	}

}
