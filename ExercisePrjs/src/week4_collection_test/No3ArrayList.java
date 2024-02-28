package week4_collection_test;
import java.util.ArrayList;
import java.util.Arrays;

public class No3ArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "Lamborghini", "Audi",
													"McLeran", "Bugatti", "Tesla", "Ferrari"));
		System.out.println(cars);
		
		cars.remove(4);
		System.out.println(cars);
	}
}
