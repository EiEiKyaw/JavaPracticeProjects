package Inheritance.HInheritance;

public class HInheritance {
    public static void main(String[] args) {
        person1 p1 = new person1();
        person2 p2 = new person2();

        p1.greet();
        p1.p1();
        p2.greet();
        p2.p2();
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

class person2 extends greeting {
    public void p2 () {
        System.out.println("I'm John");
    }
}