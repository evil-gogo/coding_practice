package fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int limit = 10;
		System.out.println("Sum " + calculateFibonacci(limit));
	}

	private static int calculateFibonacci(int limit) {
		// TODO Auto-generated method stub
		if (limit <= 2)
			return 1;
		else {
			return calculateFibonacci(limit - 1) + calculateFibonacci(limit - 2);
		}
	}
}
