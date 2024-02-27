package WEEK4_Exercise.exercise3;
import java.util.*;

public class DupValue {
	public static void main(String[] args) {
		int index;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the index of the array");
		index = scan.nextInt();
		System.out.println("Enter the elements of the array");
		int[] num = new int[index];
		
		for(int i = 0; i<index; i++) {
			num[i] = scan.nextInt();
		}

		System.out.println("The Duplicate Number");
		for(int i = 0; i < num.length;i++ ) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] == num[j]) {
					System.out.printf("%d ", num[j]);
				}
			}
		}
	}
}
