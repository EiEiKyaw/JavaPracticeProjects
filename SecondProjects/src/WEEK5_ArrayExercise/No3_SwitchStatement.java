package WEEK5_ArrayExercise;

import java.util.Scanner;

public class No3_SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number of Days: ");
//		String days = sc.next();
//		
//		switch (days) {
//		case "1":System.out.println("Monday");break;
//		case "2":System.out.println("Tuesday");break;
//		case "3":System.out.println("Wednesday");break;
//		case "4":System.out.println("Thusday");break;
//		case "5":System.out.println("Firday");break;
//		case "6":System.out.println("Saturday");break;
//		case "7":System.out.println("Sunday");break;
//		default :System.out.println("Invalid");break;
//		}
		System.out.println("You can choose \n1.Even Number \n2.Odd Number \n3.exit");
		int num = sc.nextInt();

		switch (num) {

		case 1: {
			System.out.print("\nEnter Number :");
			int evenNum = sc.nextInt();
			for (int i = 1; i < evenNum; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		}
			break;

		case 2: {
			System.out.print("\nEnter Number :");
			int oddNum = sc.nextInt();
			for (int i = 1; i < oddNum; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
			break;

		case 3: 
			System.out.println("Thank You!!");
			break;

		default: 
			System.out.println("Invalid choice. Please choose again.");
			break;

		}

	}

}
