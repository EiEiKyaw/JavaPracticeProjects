package InterfaceDemonstrate;

interface Person{
	void name();
	void id();
	
	default void grade() {
		System.out.println("Student's grade is A.");
	}
}

class Student implements Person{

	@Override
	public void name() {
		System.out.println("Student name is Mg Mg.");
	}

	@Override
	public void id() {
		System.out.println("Student ID is 101021");
	}
	
}


public class DefaultMethod {
	public static void main(String[] args) {
		Student stuObj = new Student();
		stuObj.name();
		stuObj.id();
		stuObj.grade();
	}

}
