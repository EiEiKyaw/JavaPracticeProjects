package Inheritance.HInheritance;

public class HInheritance {
    public static void main(String[] args) {
        person1 p1 = new person1();
        person2 p2 = new person2();

        p1.greeting();
        p1.personGreeting1();
        p2.greeting();
        p2.personGreeting2();
    }	
}

class greeting {
    public void greeting() {
        System.out.println("Hello Everyone!!!");
    }
}

class person1 extends greeting {
    public void personGreeting1 () {
        System.out.println("This is Jack");
    }
}

class person2 extends greeting {
    public void personGreeting2 () {
        System.out.println("I'm John");
    }
}