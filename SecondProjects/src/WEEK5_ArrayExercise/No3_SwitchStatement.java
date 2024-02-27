package WEEK5_ArrayExercise;

import java.util.Scanner;

public class No3_SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Days: ");
		String days = sc.next();
		
		switch (days) {
		case "1":System.out.println("Monday");break;
		case "2":System.out.println("Tuesday");break;
		case "3":System.out.println("Wednesday");break;
		case "4":System.out.println("Thusday");break;
		case "5":System.out.println("Firday");break;
		case "6":System.out.println("Saturday");break;
		case "7":System.out.println("Sunday");break;
		default :System.out.println("Invalid");break;
		}

	}

}
