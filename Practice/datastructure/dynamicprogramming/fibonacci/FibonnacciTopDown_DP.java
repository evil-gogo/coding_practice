package dynamicprogramming.fibonacci;

public class FibonnacciTopDown_DP {
	private static int fib[] = new int[10];
	public static void main(String[] args) {
		int range  = 10;
		System.out.println("calculateFibonacciTopDown_DP " + calculateFibonacciTopDown_DP(range - 1));
	}

	private static int calculateFibonacciTopDown_DP(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (fib[n] != 0) {
			return fib[n];
		} else {
			return fib[n] = calculateFibonacciTopDown_DP(n - 1) + calculateFibonacciTopDown_DP(n - 2);
		}
	}
}
