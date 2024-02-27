package WEEK3_Exercise.exercise1;

public class Interface {
	public static void main(String[] args) {
		Person p1 = new Student();
		
		p1.greet();
		p1.study();
		p1.eat();
	}
}

interface Person {
	public void greet();
	public void study();
	public void eat();
}

class Student implements Person {
	public void greet() {
		System.out.println("Hello Everyone!!!! I'm John and a student.");
	}
	public void study() {
		System.out.println("I'm studying English");
	}
	public void eat() {
		System.out.println("I'm having a launch");
	}
}

