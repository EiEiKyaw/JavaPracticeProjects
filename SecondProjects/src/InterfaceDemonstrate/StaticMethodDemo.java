package InterfaceDemonstrate;

import java.util.Scanner;

interface MathOperation{
	static int add(int a, int b) {
		return a + b;
	}
}

public class StaticMethodDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		int result = MathOperation.add(num1, num2);
		System.out.println("Result of addition: " + result);
	}

}
