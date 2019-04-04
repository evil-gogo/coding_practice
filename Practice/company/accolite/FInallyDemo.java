package interviewaccolite;

public class FInallyDemo {
	public static void main(String[] args) {

		int x = method();
		System.out.println(x);
	}

	private static int method() {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			return 5;
		} finally {
			return 7;
		}
	}
}
