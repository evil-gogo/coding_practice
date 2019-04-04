package exceptionhandling_5;

public class Testing {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 20/a;
			System.out.println("b = " + b);
			
		} catch (ArithmeticException ae) {
			System.out.println("Divide by Zero Error");
		} finally {
			System.out.println("Inside the Finally Block");
		}
	}
}