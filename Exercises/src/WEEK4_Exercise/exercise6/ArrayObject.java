package WEEK4_Exercise.exercise6;

public class ArrayObject {
	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		emp[0] = new Employee(1, "John");
		emp[1] = new Employee(2, "Jack");
		emp[2] = new Employee(3, "Yin");
		emp[3] = new Employee(4, "Josh");
		emp[4] = new Employee(5, "Stone");
		
		for(Employee e: emp) {
			e.Show();
		}
	}
}

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void Show(){
		System.out.printf("EmployeeID: "+ id + " EmployeeName: " + name +"%n");
	}
}