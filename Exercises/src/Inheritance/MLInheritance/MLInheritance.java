package Inheritance.MLInheritance;

public class MLInheritance {
    public static void main(String[] args) {
        person2 greet = new person2();

        greet.greet();
        greet.p1();
        greet.p2();
    }
}

class greeting {
    public void greet() {
        System.out.println("Hello Everyone!!!");
    }
}

class person1 extends greeting {
    public void p1 () {
        System.out.println("This is Jack");
    }
}

class person2 extends person1 {
    public void p2 () {
        System.out.println("I'm John");
    }
}