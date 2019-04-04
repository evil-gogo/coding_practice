package dynamicprogramming.fibonacci;

public class FibonnacciBottomUp_DP {
	private static int fib[] = new int[10];
	public static void main(String[] args) {
		int range  = 10;
		System.out.println("calculateFibonacciBottomUp_DP " + calculateFibonacciBottomUp_DP(range - 1));
	}
	
	private static int calculateFibonacciBottomUp_DP(int n) {
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		return fib[n];
	}
}
