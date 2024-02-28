package TestEx;
import java.util.Scanner;

public class DefaultCon {
    public static void main(String[] args) {
        DefaultCon dc = new DefaultCon();
    }

    String enter = "";
    String options;
    String addOption = "add";
    String subtractOption = "subtract";
    String exitOption = "exit";
    int a, b;
    Scanner scan = new Scanner(System.in);
    public DefaultCon() {


        System.out.println("Ready to start?");
        enter = scan.findInLine("");

        if (enter == enter) {
            System.out.println("Choose one: add or subtract");
            Scanner scan1 = new Scanner(System.in);
            options = scan1.nextLine();

            do {
                if (addOption.equals(options.toLowerCase())) {
                    System.out.println("Enter a: ");
                    a = scan.nextInt();

                    System.out.println("Enter b: ");
                    b = scan.nextInt();

                    System.out.println("Sum of a and b = " + (a + b));
                    
                    System.out.println("Choose one: add or subtract or Exit [e]?");
                    Scanner scan2 = new Scanner(System.in);
                    options = scan2.nextLine();
                    
                } else if (subtractOption.equals(options.toLowerCase())) {
                    System.out.println("Enter a: ");
                    a = scan.nextInt();

                    System.out.println("Enter b: ");
                    b = scan.nextInt();

                    int subtract = (a > b) ? (a - b) : (b - a);
                    System.out.println("Subtraction of a and b = " + subtract);
                    
                    System.out.println("Choose one: add or subtract");
                    Scanner scan2 = new Scanner(System.in);
                    options = scan2.nextLine();
                    
                } else if (exitOption.equals(options.toLowerCase())) {
                	break;
                }
//                else {
//                	System.out.println("Keep developing!");
//                	break;
//                }
            }while (true);

        }
    }
}


