package Inheritance;

public class InterfaceInheritance {
	public static void main(String[] args) {
		BDGift bd = new BDGift();
		bd.gift1();
		bd.gift2();
	}
}

interface MomGaveMe{
	void gift1();
}

class BDGift extends GrandmaGaveMe implements MomGaveMe{
	public void gift1() {
		System.out.println("My mom lets me choose for BD gift.So I choose the electric guitar.");
	}
	
}

class GrandmaGaveMe{
	public void gift2() {
		System.out.println("My grandma gave me a novel book.");
	}
}
