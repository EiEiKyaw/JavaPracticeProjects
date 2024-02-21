package day1Exercise.exercise2;

public class MLInheritance {
    public static void main(String[] args) {
        person2 greet = new person2();

        greet.greet();
        greet.personGreeting1();
        greet.personGreeting2();
    }
}

class greeting {
    public void greet() {
        System.out.println("Hello Everyone!!!");
    }
}

class person1 extends greeting {
    public void personGreeting1 () {
        System.out.println("This is Jack");
    }
}

class person2 extends person1 {
    public void personGreeting2 () {
        System.out.println("I'm John");
    }
}