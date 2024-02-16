package AnimalAbstract;

public class TestMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();
        
        System.out.println();
        
        // Using Polymorphism
        Animals animal1 = new Cat();
        animal1.greeting();
        Animals animal2 = new Dog();
        animal2.greeting();
        Animals animal3 = new BigDog();
        animal3.greeting();


	}

}
