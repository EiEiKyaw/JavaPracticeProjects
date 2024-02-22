package day3Exercise.exercise6;

public class InterfaceHierarchy {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1.animalIntro();
		a1.animalSound();
		
		Animal a2 = new Cat();
		a2.animalIntro();
		a2.animalSound();
		
		Animal a3 = new Cow();
		a3.animalIntro();
		a3.animalSound();
	}
}

interface Animal{
	public void animalIntro();
	public void animalSound();

}
class Dog implements Animal{
	public void animalIntro() {
		System.out.println("This is dog");
	}
	public void animalSound() {
		System.out.println("Woof Woof");
	}
}

class Cat implements Animal{
	public void animalIntro() {
		System.out.println("This is cat");
	}
	public void animalSound() {
		System.out.println("Meow Meow");
	}
}

class Cow implements Animal {
	public void animalIntro() {
		System.out.println("This is Cow");
	}
	public void animalSound() {
		System.out.println("Moo Moo");
	}
}