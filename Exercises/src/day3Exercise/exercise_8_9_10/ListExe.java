package day3Exercise.exercise_8_9_10;

import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		ArrayList<String> personName = new ArrayList<String>();
		
		personName.add("John");
		personName.add("Mike");
		personName.add("Jame");
		personName.add("Josh");
		
		System.out.println(personName);
		
		personName.add(0,"Jack");
		
		System.out.println(personName);
		
		personName.remove(4);
		
		System.out.println(personName);
	}
}
