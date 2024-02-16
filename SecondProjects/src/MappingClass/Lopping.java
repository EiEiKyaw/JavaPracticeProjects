package MappingClass;

public class Lopping {

	static void main(String[] args) {
//		int i = 1;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println();
//		int j=11;
//		while (j>1) {
//			j--;
//			System.out.println(j);
//		}
		
		numberOne even = new numberOne();
		even.evenNumber();
		System.out.println();
		even.oddNumber();

	}

}

class numberOne{
	
	void evenNumber() {
		for (int i = 1; i < 10; i++) {
			if (i%2 ==0) {
				System.out.println("Even Number : " + i);
			}
		}
	}
	
	void oddNumber() {
		for (int i = 1; i < 10; i++) {
			if(!(i%2 == 0)) {
				System.out.println("Odd Number : " + i);
			}
		}
	}
}
