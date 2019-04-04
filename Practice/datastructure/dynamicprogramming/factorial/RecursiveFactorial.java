package dynamicprogramming.factorial;

public class RecursiveFactorial {
	public static void main(String[] args) {
		int number  = 5;
		System.out.println("calculateRecursiveFactorial " + calculateRecursiveFactorial(number));
	}

	private static int calculateRecursiveFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * calculateRecursiveFactorial(n - 1);
	}
}
