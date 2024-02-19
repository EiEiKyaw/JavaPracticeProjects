
class Parent{
	void DisplayParent(){
		System.out.println("Parent Class.");
	}
}

class Child extends Parent{
	void DisplayChild() {
		System.out.println("Child Class.");
	}
}


public class SingleOne {
	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.DisplayParent();
		obj.DisplayChild();
	}
}
