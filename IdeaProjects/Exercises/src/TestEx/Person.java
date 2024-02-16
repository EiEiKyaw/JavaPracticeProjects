package TestEx;
import java.util.Scanner;
public class Person {
    protected void keepingRecord(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scan.nextLine();
        System.out.println("Enter age:");
        int age = scan.nextInt();
        System.out.println("Enter gender:");
        char gender = scan.next().charAt(0);
        System.out.println("Enter birthdate:");
        String birthDate = scan.next();
        if (gender == 'M'){
            System.out.printf("You added a %d years-old man named %s.\nHis birthdate is %s.\n\n", age, name, birthDate);
        }
        else if (gender == 'F'){
            System.out.printf("You added a %d years-old woman named %s.\nHis birthdate is %s.\n\n", age, name, birthDate);
        }
        else {
            System.out.printf("You added a %d years-old other gender named %s.\nHis birthdate is %s.\n\n", age, name, birthDate);
        }
    }
}
