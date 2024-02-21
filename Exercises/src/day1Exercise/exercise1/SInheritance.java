package day1Exercise.exercise1;

class SInheritance {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.greeting();
        p1.personGreeting();
    }
    public void greeting () {
        System.out.println("Hello");
    }
}

class Person extends SInheritance {
    public void personGreeting() {
        System.out.println("My name is John");
    }
}
