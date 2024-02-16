
class Parent1{
	void DisplayParent1() {
		System.out.println("Patent Class.");
	}
}

class Child1 extends Parent1{
	void DisplayChild1() {
		System.out.println("Child Class.");
	}
}

class Other extends Child1{
	void DisplayOther() {
		System.out.println("Other Class.");
	}
}

public class MultiInheritance {

	public static void main(String[] args) {
		Other otherObj = new Other();
		
		otherObj.DisplayParent1();
		otherObj.DisplayChild1();
		otherObj.DisplayOther();

	}

}
