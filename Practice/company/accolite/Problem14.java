package accolite2;

public class Problem14 {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
			// TODO: handle exception
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static void badMethod() {
		throw new Error();
	}
}
