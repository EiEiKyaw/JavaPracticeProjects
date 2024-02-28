package main.java.winlwin.com.management;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private static Manager manager;
	public List<Student> students = new ArrayList<Student>();
	
	private Manager() {}
	
	public static Manager createManager() {
		if (manager == null) {
			manager = new Manager();
		}
		return manager;
	}
	
	public int getStudentId() {
		return students.size() + 1;
	}
	
	
	public void addStudent(Student student) {
		boolean studentExist = false;
		
		for(Student s: getStudents()) {
			if(s.name.equals(student.name)){
				studentExist = true;
				break;
			}
		}
		
		if(!studentExist) {
			students.add(student);
		} 
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
}
