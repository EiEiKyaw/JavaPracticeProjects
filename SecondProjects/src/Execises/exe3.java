package Execises;

class ClassA {
	public int F(int i) {
		System.out.print("F(int): ");
		return i + 4;
	}
}

class ClassB extends ClassA{
	public double F(double i) {
		System.out.print("F(double): ");
		return i + 3.3;
	}
}

public class exe3 {

	public static void main(String[] args) {
		ClassB aObj = new ClassB();		
		System.out.println(aObj.F(3));
		System.out.println(aObj.F(3.3));
		
	}

}
