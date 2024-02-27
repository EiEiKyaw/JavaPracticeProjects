package WEEK5_ArrayExercise;

public class No1_DuplicateEx {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,55,4,3,5,6,7,43,25,78,55,25,43,1};
		
		for(int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				 if(number[i] == number[j]) {
					 System.out.println("Duplicate Number: " + number[i]);
				 }
			}
		}

	}

}
