package WEEK4_Exercise.exercise5;
import java.util.*;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = scan.nextLine();
		System.out.println("Are you Male?");
		Boolean gender = scan.nextBoolean();
		int i = 0;
		if(gender==true) {
			i=1;
		}else if(gender==false) {
			i=2;
		}
		scan.close();
		
		switch (i) {
			case 1:
				System.out.println("Hello, Mr "+ userName + ". Nice to meet you");
				break;
			case 2:
				System.out.println("Hello, Ms "+ userName + ". Nice to meet you.");
				break;
		}
	}
}
