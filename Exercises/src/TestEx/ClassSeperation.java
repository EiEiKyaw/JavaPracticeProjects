package TestEx;


public class ClassSeperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scan.nextInt();
        System.out.println("Enter y: ");
        int y = scan.nextInt();
        Add a = new Add();
        System.out.println("Sum of x and y = " + a.addition(x, y));
        Subtract s = new Subtract();
        System.out.println("Subtraction of x and y = " + s.subtraction(x, y));
    }
}

