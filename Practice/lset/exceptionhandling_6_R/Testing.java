package exceptionhandling_6_R;

public class Testing {
	public static void main(String[] args) {
		try {
			int a[] = {1, 2, 3, 4};
			for (int i = 1; i <= 4; i++) {
				System.out.println("a[" + i + "] " + a[i]);
			}
			
		} catch (Exception e) {
			System.out.println("Error = " + e);
		} catch (ArrayIndexOutOfBoundsException e) { //Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}