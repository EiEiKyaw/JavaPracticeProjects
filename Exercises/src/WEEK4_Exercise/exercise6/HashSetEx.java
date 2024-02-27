package WEEK4_Exercise.exercise6;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> students = new HashSet<String>();
		students.add("John");
		students.add("Mike");
		students.add("Jame");
		students.add("Mike");
		students.add("Yeve");
		
		System.out.println(students);
		students.remove("Jame");
		System.out.println(students);
	}
}
