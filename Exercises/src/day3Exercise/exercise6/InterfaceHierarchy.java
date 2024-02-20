package day3Exercise.exercise6;

public class InterfaceHierarchy {
	public static void main(String[] args) {
		Dog a1 = new Dog();
		
		a1.animalIntro();
		a1.dogIntro();
		a1.dogSound();
		
		Cat a2 = new Cat();
		a2.catIntro();
		a2.catSound();
	}
}

class Animal implements AnimalSound{
	public void animalIntro() {
		System.out.println("There are many kind of animal");
	}
}

class Dog extends Animal{
	public void dogIntro() {
		System.out.println("This is dog");
	}
}

class Cat extends Animal{
	public void catIntro() {
		System.out.println("This is cat");
	}
}

interface AnimalSound {
	default void dogSound() {
		System.out.println("Woof Woof");
	}
	default void catSound() {
		System.out.println("Meow Meow");
	}
}