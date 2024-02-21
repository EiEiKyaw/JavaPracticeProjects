package com.collection.test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "Lamborghini", "Audi",
													"McLeran", "Bugatti", "Tesla", "Ferrari"));
		System.out.println(cars);
		
		cars.remove(4);
		System.out.println(cars);
	}
}
