package dynamicprogramming.factorial;

public class FactorialBottomUp_DP {
	static int fact[] = new int[10];
	public static void main(String[] args) {
		int number  = 5;
		System.out.println("calculateRecursiveFactorial " + calculateRecursiveFactorial(number));
	}

	private static int calculateRecursiveFactorial(int n) {
		fact[0] = 1;
		fact[1] = 1;
		for (int i = 2; i <= n; i++) {
			fact[i] = i * fact[i - 1];
		}
		
		return fact[n];
	}
}
