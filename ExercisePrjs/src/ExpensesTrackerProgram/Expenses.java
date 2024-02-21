package ExpensesTrackerProgram;
import java.util.Scanner;
import java.io.*;

public class Expenses {
	int amount;
	String category;
//	String description;
	int expenses;
	int updatedExpenses;
	
	Scanner scan = new Scanner(System.in);
	
	public int getAmount() {
//		amount = scan.nextInt();
		return amount;
	}
	public void setAmount() {
		System.out.println("Enter amount to keep: ");
		amount = scan.nextInt();
		System.out.printf("Your amount = %d \n", amount);
	}
	public int getExpenses() {
//		expenses = scan.nextInt();
		return expenses;
	}
	public int getUpdatedExpenses() {
		updatedExpenses += getExpenses();
		return updatedExpenses;
	}
	public void setExpenses() {
//		System.out.printf("Type expenses for this category \"%s\" : ", getCategory());
		System.out.println("Deposit [Y, n]?");
		char yesOrNo = scan.next().charAt(0);
//		while (yesOrNo == 'Y') {
		do {
			if (yesOrNo == 'Y'){
				System.out.println("Type your expenses for this category: ");
				expenses = scan.nextInt();
				updatedExpenses += expenses;
				System.out.printf("Your current expenses = %d \n", updatedExpenses);
				
				System.out.println("Continue for deposit [Y] or Exit [e]?");
				char exit = scan.next().charAt(0);
//				if (exit != 'e' || yesOrNo == 'c') {
//					
//				}
				if (exit == 'e') {
					break;
				}
			else if (yesOrNo == 'n') {
				break;
			}
			else {
				System.out.println("Invalid character!");
			}
		}
//		}
		}while(yesOrNo == 'Y');
		//}
		
//		while (yesOrNo == 'Y') {
//			switch (yesOrNo) {
//				case 'Y':
//					System.out.println("Type your expenses for this category: ");
//					expenses = scan.nextInt();
//					updatedExpenses += expenses;
//					System.out.printf("Your current expenses = %d \n", updatedExpenses);
//			}
//		}
	}
	public void setCategory() {
		System.out.println("Category: ");
		category = scan.next();
		System.out.printf("You spend money on %s ", category);
	}
	
}
