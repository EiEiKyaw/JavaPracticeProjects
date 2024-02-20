package Exercise;

public class Person {
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void personInfo (){
        
    }

    public static void main(String[] args) {
        Student s1 =new Student("Jack", 16, 101, 10);

        s1.personInfo();
    }
}