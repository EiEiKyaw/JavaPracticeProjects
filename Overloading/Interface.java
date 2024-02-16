package Overloading;

interface Student {
    public void greet();
    public void name();
    public void age();
}

class Person implements Student{
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
public class Interface {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person2 p2 = new Person2();

        p1.greet();
        p1.name();
        p1.age();

        p2.greet();
        p2.name();
        p2.age();
    }
}