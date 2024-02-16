package Inheritance;
import java.util.Scanner;
public class Account {
    String accountNumber;
    int balance;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount();
        check.checkingBalance(check.balance);

        SavingsAccount save = new SavingsAccount();
        save.deposit();

        check.checkingBalance(check.balance);
    }

    public int getBalance() {
        return balance;
    }

    public void checkingBalance(int balance){
        if (balance == 0){
            System.out.println("No money in your account.");
        }
        else {
            System.out.printf("You have %d amount in your account.", balance);
        }
    }
    int depositMoney = 0;
    public void deposit(){
        System.out.println("Press 'd' for deposit.");
        char depositBtn = scan.next().charAt(0);
        if (depositBtn == 'd'){
            System.out.println("Enter amount to save.");
            balance = scan.nextInt();
            if (depositMoney == getBalance()){
                System.out.println("No deposit money!");
            }
            else {
                depositMoney += balance;
                System.out.printf("You added %d amount to your account.", balance);
            }
        }

    }
}
