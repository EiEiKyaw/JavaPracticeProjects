
public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account("A001", "Tan Ahn Tick", 100);
		System.out.println(a1);
		Account a2 = new Account("A002", "Khumar");
		System.out.println(a2);
		
		//Test Getter
		
		System.out.println("ID: " + a1.getID());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());
		
		System.out.println();
		
		a1.credit(120);
		System.out.println(a1);
		a1.debit(50);
		System.out.println(a1);
		a1.debit(400);
		System.out.println(a1);
		
		System.out.println();
		
		a1.transferTo(a2, 150);
		System.out.println(a1);
		System.out.println(a2);

	}

}
