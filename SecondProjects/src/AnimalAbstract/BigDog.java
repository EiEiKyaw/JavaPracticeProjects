package AnimalAbstract;

public class BigDog extends Dog{

	public BigDog() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "BigDog[" + super.toString() + ']';
	}
	
	public void greeting() {
		System.out.println("Woow!");
	}
	
	public void greeting(BigDog another) {
		System.out.println("Wooooooooow!");
	}

}
