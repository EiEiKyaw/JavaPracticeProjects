package WEEK5_ArrayExercise;

import java.util.Arrays;

public class No2_SpecificPosition {

	public static void main(String[] args) {	
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		System.out.println("Initial Array\n" + Arrays.toString(arr));
		
		int x = 30;
		int position = 6;	
		arr = insertX(n, arr, x, position);
		
		System.out.println("Insert Specific Value:\n" + Arrays.toString(arr));
		

	}
	
	public static int[] insertX (int n, int arr[], int x, int positon) {
		int i;
		int newarr[] = new int[n+1];
		
		for (i=0; i<n+1; i++) {
			if(i <positon-1) {
				newarr[i] = arr[i];
			}else if(i == positon-1) {
				newarr[i] = x;
			}else {
				newarr[i] = arr[i-1];
			}
		}
		
		return newarr;
	}

}
