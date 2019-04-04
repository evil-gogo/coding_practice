package dynamicprogramming.fibonacci;

public class RecursiveFibonnacci {
	public static void main(String[] args) {
		int range  = 10;
		System.out.println("calculateRecursiveFibonacci " + calculateRecursiveFibonacci(range));
	}

	private static int calculateRecursiveFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return calculateRecursiveFibonacci(n - 1) + calculateRecursiveFibonacci(n - 2);
	}
}
