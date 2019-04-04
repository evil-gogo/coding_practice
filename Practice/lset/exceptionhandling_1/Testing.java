package exceptionhandling_1;

public class Testing {
	public static void main(String[] args) {
	try {
			throw 10; //No exception of type int can be thrown; an exception type must be a subclass of Throwable
		} catch (int e) {
			// TODO: handle exception
			System.out.println("Got the Exception " + e);
		}
	}

}
