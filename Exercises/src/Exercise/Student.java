package Exercise;


public class Student extends Person {
    protected int StudentID;
    protected int Grade;
    Student(String name, int age, int StudentID, int Grade){
        super(name, age);
        this.StudentID = StudentID;
        this.Grade = Grade;
    }

    void personDetail() {
        // super.personDetail();
        System.out.println("Student ID: "+StudentID +"\n Name: " + name + "\n Age: " + age + "\n Grade: " + Grade);
    }
}
