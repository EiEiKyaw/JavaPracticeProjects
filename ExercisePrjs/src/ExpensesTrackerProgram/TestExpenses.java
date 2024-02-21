package ExpensesTrackerProgram;

public class TestExpenses {
	public static void main(String[] args) {
		Expenses userExp = new Expenses();
		userExp.setAmount();
//		userExp.setCategory();
		userExp.setExpenses();
		CalculateExpenses cal = new CalculateExpenses();
		cal.showTheResult();
	}
}
