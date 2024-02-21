package TestEx;
import java.util.Scanner;
public class Student extends Person {
    @Override
    protected void keepingRecord() {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter student ID:");
			int studentID = scan.nextInt();
			System.out.println("Student ID: " + studentID);
		}
        super.keepingRecord();
    }
}
