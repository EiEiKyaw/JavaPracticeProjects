package TestEx;
import java.util.Scanner;

public class TwoFuncInMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Num 2: ");
        int num2 = scan.nextInt();
        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));

    }
    private static int add(int num1, int num2){
        return num1 + num2;
    }
    private static int subtract(int num1, int num2){
        return num1 - num2;
    }
}
