package Inheritance.SInheritance;

class SInheritance {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.greeting();
        p1.p1();
    }
    public void greeting () {
        System.out.println("Hello");
    }
}

class Person extends SInheritance {
    public void p1() {
        System.out.println("My name is John");
    }
}
