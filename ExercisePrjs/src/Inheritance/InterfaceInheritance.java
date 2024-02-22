package Inheritance;

public class InterfaceInheritance {
	public static void main(String[] args) {
		Son s = new Son();
		s.myGrandmaGive();
		s.myMomGive();
	}
}

interface MyGrandma{
	void myGrandmaGive();
}

interface Mother extends MyGrandma {
	void myMomGive();
}

class Son implements Mother{
	public void myGrandmaGive() {
		System.out.println("My Grandma gives my mother a diamond necklace as a legacy.");
	}
	
	public void myMomGive() {
		System.out.println("Later, my mother gives me to continue keeping.");
	}
}


