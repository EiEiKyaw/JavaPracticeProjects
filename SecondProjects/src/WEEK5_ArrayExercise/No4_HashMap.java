package WEEK5_ArrayExercise;

import java.util.HashMap;
import java.util.Map;

public class No4_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> Student = new HashMap<Integer, String>();
		
		Student.put(1, "Mg Mg");
		Student.put(2, "Aung Aung");
		Student.put(3, "Hla Hla");
		Student.put(4, "Aye Aye");
		Student.put(5, "Lin Lin");
		
		System.out.println("HashMap List: " + Student);
		System.out.println();
		
		Student.put(5, "Ye Ye");
		System.out.println("Updating No5.: " + Student);
		System.out.println();
		
		for (Map.Entry<Integer, String> e : Student.entrySet()) {
			System.out.println("Keys: " + e.getKey() + " Values: " + e.getValue());
		}
		

	}

}
