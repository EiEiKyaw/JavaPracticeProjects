package WEEK5_ArrayExercise;

import java.util.ArrayList;
import java.util.Collections;

public class No4_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> book = new ArrayList<String>();
		
		book.add("Anime Book");
		book.add("Cartoon Book");
		book.add("Story Book");
		book.add("Love Story Book");
		
		System.out.println(book);
		System.out.println();
		for (String b : book) {
			System.out.println(b);
		}
		System.out.println();
		
		book.add(1,"Hello");
		System.out.println("Add Element =>");
		System.out.println(book);
		System.out.println();
		
		book.remove(1);
		System.out.println("Remove Index(1) =>");
		Collections.sort(book);
		System.out.println(book);

	}

}
