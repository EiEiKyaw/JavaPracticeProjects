package main.java.winlwin.com.collections;

public class DynamicArrayExercise {

	static int[] insert(int position, int value, int[] arr) {
		position = position - 1;

		int[] numbers = new int[arr.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			if (i < position) {
				numbers[i] = arr[i];
			} else if (i == position) {
				numbers[i] = value;
			} else {
				numbers[i] = arr[i - 1];
			}
		}
		return numbers;
	}

	static void testInsert(int position, int value, int[] numbers) {
		int[] items = insert(position, value, numbers);
		for (int item : items) {
			System.out.print(item + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] testOne = { 1, 3, 4, 5 };
		testInsert(2, 10, testOne);

		int[] testTwo = { 4, 5, 6, 4, 2, 5 };
		testInsert(4, 40, testTwo);

	}

}
