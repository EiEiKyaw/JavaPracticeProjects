class ParentOne{
	void DisplayParentOne() {
		System.out.println("ParentOne Class.");
	}
}

class ChildOne extends ParentOne{
	void DisplayChildOne() {
		System.out.println("ChildOne Class.");
	}
}

class ChildTwo extends ParentOne{
	void DisplayChildTwo() {
		System.out.println("ChildTwo Class.");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		ChildOne obj1 = new ChildOne();
		ChildTwo obj2 = new ChildTwo();
		
		obj1.DisplayParentOne();
		obj1.DisplayChildOne();
		
		System.out.println();
		
		obj2.DisplayParentOne();
		obj2.DisplayChildTwo();
		
	}

}
