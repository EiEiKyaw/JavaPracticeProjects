package Inheritance;

public class InterfaceHierarchy {
	public static void main(String[] args) {
		MyAttitude a = new MyAttitude();
		a.obey1();
		a.obey2();
	}
}

interface Rule1{
	public void obey1();
}

interface Rule2{
	public void obey2();
}

class MyAttitude implements Rule1, Rule2{
	public void obey1() {
		System.out.println("You are true if you are true.");
	}
	public void obey2() {
		System.out.println("You are always true if you are false.");
	}
}
