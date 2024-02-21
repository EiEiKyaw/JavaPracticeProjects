package ExpensesTrackerProgram;

public class CalculateExpenses extends Expenses{
	private int calculate() {
		int lastAmount;
		lastAmount = super.getAmount() - super.getUpdatedExpenses();
		return lastAmount;
	}
	public void showTheResult() {
		System.out.printf("You left %d in your wallet.", calculate());
	}
}
