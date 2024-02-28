package week4_collection_test;
import java.util.ArrayList;
import java.util.Arrays;

public class No2ArrayList {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cow"));
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
		
		animals.add(0, "Bird");
		for (int i = 0; i < animals.size(); i++) {
			String animal = animals.get(i);
			System.out.println(animal);
		}
	}
}
