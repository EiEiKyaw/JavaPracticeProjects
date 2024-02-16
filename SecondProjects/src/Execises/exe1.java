package Execises;

class Person{
	 String name;
	 int age;
	 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student extends Person{
	private int rollNumber;
	
	public Student(String name, int age, int rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
	}
	
	public void DisplayStudent() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student RollNumber: " + rollNumber);
		
	}
}

public class exe1 {

	public static void main(String[] args) {
		Student stuObj = new Student("John", 18, 101);
		
		//stuObj.display();
		stuObj.DisplayStudent();
	}
}
