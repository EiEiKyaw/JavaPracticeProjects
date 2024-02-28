package main.java.winlwin.com.management;

public class Main {
//Exercise:
//You are tasked with developing a simple program to manage a list of students and their courses. Each student can be enrolled in multiple courses. Implement the following functionalities:
//
//	    Allow the user to add a new student to the system along with the courses they are enrolled in.
//	    Allow the user to view the courses a particular student is enrolled in.
//	    Allow the user to view all students enrolled in a particular course.
//	    Ensure that there are no duplicate enrollments for students in the same course.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = Manager.createManager();
		manager.addStudent(new Student(manager.getStudentId(), "Abe"));
		manager.addStudent(new Student(manager.getStudentId(), "Abe"));
		manager.addStudent(new Student(manager.getStudentId(), "Vincii"));
		
		System.out.println("id \t" + "name \t\t\t" + "enrolled");
		
		for(Student student: manager.getStudents()) {
			System.out.println(student.id + "\t" + student.name + "\t\t\t" + student.courses.get("courses"));                                                        
		}

	}
	

}
