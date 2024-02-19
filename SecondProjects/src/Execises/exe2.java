package Execises;

class Parent{
	protected int num = 10;
	
	protected void display() {
		System.out.println("Hello World.");
	}
}

class Child extends Parent{
	void ChildMethod(){
		System.out.println("Number: " + num);
		display();
	}
}

public class exe2 {
	public static void main(String[] args) {
		Child childObj = new Child();
		childObj.ChildMethod();
	}
}
