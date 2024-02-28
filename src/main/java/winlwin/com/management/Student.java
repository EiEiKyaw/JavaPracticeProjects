package main.java.winlwin.com.management;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
	public int id;
	public String name;
	public Map<String, Set<String>> courses = new HashMap<String, Set<String>>();
	
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
		
		HashSet<String> enrolledCourses = new HashSet<String>();
		enrolledCourses.add("angular");
		enrolledCourses.add("vue");
		enrolledCourses.add("react");
		courses.put("courses", enrolledCourses);
	}

}
