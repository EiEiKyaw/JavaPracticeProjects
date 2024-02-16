package Overloading;

class Person {
    void greet(){
        System.out.println("Hello Everyone!!!!!!");
    }
}

class Student extends Person {
    void greet(String name) {
        System.out.println("My name is " + name);
    }

    void greet(String name, int age){
        System.out.println("I'm " + name + " and " + age + " years old");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Student p1 = new Student();

        p1.greet();
        p1.greet("John");
        p1.greet("Tom", 16);
    }
}