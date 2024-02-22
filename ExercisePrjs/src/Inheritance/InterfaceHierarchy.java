package Inheritance;

public class InterfaceHierarchy {
	public static void main(String[] args) {
		HerSonMe m = new HerSonMe();
		m.give();
		MySister ms = new MySister();
		ms.give();
	}
}

interface MyMom {
	void give();
}

class HerSonMe implements MyMom{
	public void give() {
		System.out.println("Mom gives me a electric guitar.");
	}
}

class MySister implements MyMom{
	public void give() {
		System.out.println("And mom also gives my little sister an angel's dress.");
	}
}

