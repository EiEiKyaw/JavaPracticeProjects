package Inheritance;

public class InterfaceWithDF {
	public static void main(String[] args) {
		Remember r = new Remember();
		r.quote1();
		r.quote2();
	}
}

interface Moti{
	default void quote1() {
		System.out.println("You are always right whatever it takes.");
	}
	default void quote2() {
		System.out.println("Never give up.");
	}
}

class Remember implements Moti{
	
}
