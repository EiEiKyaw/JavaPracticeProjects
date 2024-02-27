package WEEK3_Exercise.exercise5;

public class StaticMethod {
	public static void main(String[] args) {		
		Person.greet();
		Person.introduce();
		
		Person p1 = new Student();
				
		p1.study();
		p1.eat();
	}
}
interface Person {
	static void greet() {
		System.out.println("Hello Everyone!!!!");
	}
	static void introduce() {
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
