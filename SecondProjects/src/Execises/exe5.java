package Execises;

class Parent1{
	Parent1 whoIam(){
		System.out.println("I am a parent.");
		return this;
	}
}

class Child1 extends Parent1{
	@Override
	Child1 whoIam() {
		System.out.println("I am a Child.");
		return this;
	}
}
public class exe5 {

	public static void main(String[] args) {
		Child1 childObj = new Child1();
		Child1 result = childObj.whoIam();
		System.out.println("Returned type: " + result.getClass().getName());

		Parent1 parent = new Parent1();
		
		Parent1 result1 = parent.whoIam();
		System.out.println("Returned type: " + result1.getClass().getName());
		
	}

}
