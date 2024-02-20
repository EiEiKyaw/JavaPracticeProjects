package day3Exercise.exercise4;

interface Person {
	default void greet() {
		System.out.println("Hello Everyone!!!!");
	}
	default void introduce() {
		System.out.println("I'm John, a student");
	}
	public void study();
	public void eat();
}

class Student implements Person {
	public void study() {
		System.out.println("I'm studying English");
	}
	public void eat() {
		System.out.println("I'm having a launch");
	}
}

public class DefaultMethod{
	public static void main(String[] args) {
		Person p1 = new Student();
		
		p1.greet();
		p1.introduce();
		p1.study();
		p1.eat();
	}
}