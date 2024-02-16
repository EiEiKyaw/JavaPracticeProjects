package Execises;

import java.util.ArrayList;

public class hh {
	public static void main(String[] args) {
		
		 for (int i = 1; i <= 20; i++) {
	            if (isPowerfulNo(i)) {
	                System.out.println(i + " is a powerful number.");
	            } else {
	                System.out.println(i + " is not a powerful number.");
	            }
	        }
	    }

	    public static boolean isPowerfulNo(int num) {
	        // Find prime factors of the number
	        ArrayList<Integer> primeFactors = new ArrayList<>();
	        int temp = num;
	        for (int i = 2; i * i <= temp; i++) {
	            while (temp % i == 0) {
	                primeFactors.add(i);
	                temp /= i;
	            }
	        }
	        if (temp > 1) {
	            primeFactors.add(temp);
	        }

	        // Check if square of each prime factor divides the number completely
	        for (int factor : primeFactors) {
	            if (num % (factor * factor) != 0) {
	                return false;
	            }
	        }
	        return true;
		

	}

}
