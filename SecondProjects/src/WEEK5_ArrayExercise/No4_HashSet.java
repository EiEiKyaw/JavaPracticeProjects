package WEEK5_ArrayExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class No4_HashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Myanmar");
		set.add("India");
		set.add("UK");
		set.add("Singpore");
		set.add("Australia");
		set.add("Myanmar"); // duplicate element
		set.add("India");
		
		System.out.println("HashSet of List => " +set);
		
		System.out.println("List contain India? => " + set.contains("India"));
		System.out.println("List contain Thailand? => " + set.contains("Thailand"));
		
		System.out.println();
		System.out.println("Iteration over lsit => ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println("\nHashSet Element Sorting: " + list);
	}

}
