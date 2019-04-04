package dynamicprogramming.fibonacci;

public class FibonacciBest {
	public static void main(String[] args) {
		int range  = 10;
		System.out.println("calculateFibonacciBest " + calculateFibonacciBest(range - 1));
	}

	private static int calculateFibonacciBest(int n) {
		int a = 0, b = 1, sum = 0;
		for (int i = 0; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}
}
