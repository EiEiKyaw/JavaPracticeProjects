package Inheritance;

public class MultipleInheritances {
	public static void main(String[] args) {
		MyFav f = new MyFav();
		f.food();
		f.clothes();
		f.car();
	}
}

interface Fav1{
	void food();
}

interface Fav2{
	void clothes();
}

interface Fav3{
	void car();
}

class MyFav implements Fav1, Fav2, Fav3 {
	public void food() {
		System.out.println("I like McDonald.");
	}
	public void clothes() {
		System.out.println("I like LV.");
	}
	public void car() {
		System.out.println("Among cars, I love Lamborghini.");
	}
}
