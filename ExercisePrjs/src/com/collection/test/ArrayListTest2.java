package com.collection.test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cow"));
		System.out.println(animals);
		
		animals.add(0, "Bird");
		System.out.println(animals);
	}
}
