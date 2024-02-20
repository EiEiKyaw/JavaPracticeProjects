package InterfaceDemonstrate;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add("Element 1");
		arraylist.add("Element 2");
		arraylist.add("Element 3");
		arraylist.add("Element 4");
		arraylist.add("Element 5");
		arraylist.add("Element 6");
		arraylist.add("Element 7");
		System.out.println("Array list: " + arraylist);
		System.out.println();
		
		arraylist.add(0, "Element firstOne");
		System.out.println("After insert into the first position:");
		System.out.println(arraylist);
		System.out.println();
		
		arraylist.remove(5);
		System.out.println("After remove fifth Element form arraylist: ");
		System.out.println(arraylist);
	}

}
