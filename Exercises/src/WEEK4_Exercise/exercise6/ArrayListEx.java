package WEEK4_Exercise.exercise6;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("fox");
		animals.add("wolf");
		animals.add("tiger");
		
		animals.remove(1);
		animals.set(1, "monkey");
		
		System.out.println(animals);
		System.out.println("Size of the array: "+animals.size());
		
		for(String animal : animals) {
			System.out.printf("%s ", animal);
		}
	}
}
