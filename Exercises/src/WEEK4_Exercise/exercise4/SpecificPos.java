package WEEK4_Exercise.exercise4;
import java.util.*;
public class SpecificPos {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the index of the array");
		int index;
		index = scan.nextInt();
		System.out.println("Enter the elements of the array");
		int[] nums = new int[index];
		
		for(int i = 0; i<index; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Your Array" + Arrays.toString(nums));

		System.out.println("Enter the Specific Position to change");
		int numPos = scan.nextInt()-1;
		System.out.println("Enter the Number");
		int Num = scan.nextInt();
		
		for(int j = nums.length - 1; j >numPos; j--) {
			nums[j] = nums[j-1];
		}
		nums[numPos] = Num;
		
		System.out.println("After Insert" + Arrays.toString(nums));
	}
}
