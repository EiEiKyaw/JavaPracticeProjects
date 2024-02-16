package Execises;

class A {
	public int F(int i) {
		System.out.print("F(int): ");
		return i + 4;
	}
}

class B extends A{
	public double F(double i) {
		System.out.print("F(double): ");
		return i + 3.3;
	}
}

public class exe3 {

	public static void main(String[] args) {
		B aobj = new B();		
		System.out.println(aobj.F(3));
		System.out.println(aobj.F(3.3));
		
	}

}
