package WEEK2_Exercise.exercise1;


public class Student extends Person {
    protected int studentID;
    protected int Grade;
    Student(String name, int age, int studentID, int Grade){
        super(name, age);
        this.studentID = studentID;
        this.Grade = Grade;
    }

    void personInfo() {
        // super.personDetail();
        System.out.println("Student ID: "+studentID +"\n Name: " + name + "\n Age: " + age + "\n Grade: " + Grade);
    }
}
