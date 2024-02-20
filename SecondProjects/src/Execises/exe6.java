package Execises;

class ClassA1{
	ClassA1 Foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A1.");
	}
}

class ClassA2 extends ClassA1{      
	@Override
	ClassA1 Foo() {
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A2.");
	}
}

class ClassA3 extends ClassA1{
	@Override
	ClassA1 Foo() {
		return this;
	}
	void print() {
		System.out.println("Inside the class A3.");
	}
}


public class exe6 {
	public static void main(String[] args) {
		ClassA1 a1 = new ClassA1();
		a1.Foo().print();
		
		ClassA2 a2 = new ClassA2();
		a2.Foo().print();
		
		ClassA3 a3 = new ClassA3();
		a3.Foo().print();

	}
}
