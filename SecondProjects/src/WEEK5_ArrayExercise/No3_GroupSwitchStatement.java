package WEEK5_ArrayExercise;

import java.util.Scanner;

public class No3_GroupSwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter days: ");
		String days = sc.next();
		
		switch (days) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thusday":
		case"Firday":
			System.out.println("Week Day");break;
			
		case "Saturday":
		case "Sunday":
			System.out.println("Week End");break;
			
			default :
				System.out.println("Invalid Data!");
		}
	}
}
