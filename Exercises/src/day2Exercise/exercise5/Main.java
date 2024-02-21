package day2Exercise.exercise5;

interface Student {
    public void greet();
    public void name();
    public void age();
}

class Person1 implements Student{
    public void greet() {
        System.out.println("Hello Everyone!!!!!");
    }
    public void name() {
        System.out.println("My name is John");
    }
    public void age() {
        System.out.println("I'm 16 years old");
    }
}

class Person2 implements Student {
    public void greet() {
        System.out.println("Hellu.......... Hellu..........");
    }
    public void name() {
        System.out.println("It's me, Tommy");
    }
    public void age() {
        System.out.println("I'm 15 years old");
    }
}
public class Main {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();

        p1.greet();
        p1.name();
        p1.age();

        p2.greet();
        p2.name();
        p2.age();
    }
}