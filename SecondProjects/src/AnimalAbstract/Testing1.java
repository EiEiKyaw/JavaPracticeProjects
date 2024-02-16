package AnimalAbstract;

class ParentClass{
	int a;
	public ParentClass(int x) {
		a = x;
	}
}


class ChildClass extends ParentClass{
	int b;
	public ChildClass(int x, int y) {
		super(x);
		b = y;	
	}	
	void show() {
		System.out.println("Value of a :" + a + "\nValue of b :" + b);
	}
}




public class Testing1 {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass(20,30);
		obj.show();

	}

}
