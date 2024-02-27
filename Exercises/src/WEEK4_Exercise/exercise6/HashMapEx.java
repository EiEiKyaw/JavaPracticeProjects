package WEEK4_Exercise.exercise6;

import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> fruits = new HashMap<Integer, String>();
		fruits.put(1, "banana");
		fruits.put(2, "mango");
		fruits.put(3, "orange");
		fruits.put(4, "apple");
		
		fruits.replace(3, "grape");
		
		fruits.remove(4);
		
		System.out.println(fruits.get(2));
		
		Set num = fruits.keySet();
		System.out.println(num);
		
		for(String fruit: fruits.values()) {
			System.out.println(fruit);
		}
	}
}
