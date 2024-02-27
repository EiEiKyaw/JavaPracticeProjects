package WEEK4_Exercise.exercise5;
import java.util.*;

public class GpSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number 1 to 10 to get random color");
		int num = scan.nextInt();
		scan.close();
		switch (num) {
			case 1:
			case 3:
			case 5:
				System.out.println("You get Black color");
				break;
			case 7:
			case 9:
			case 10:
				System.out.println("You get White color");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("You get Grey color");
				break;
			case 8:
				System.out.println("Congratulation!!! You get Rare color, Rainbow!!!");
				break;
			default:
				System.out.println("You enter invalid number");
		}
	}
}
