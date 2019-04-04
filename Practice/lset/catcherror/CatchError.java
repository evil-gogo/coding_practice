package catcherror;

public class CatchError {
	public static void main(String[] args) {
		try {
			System.out.println("Try");
			throw new Error();
		} catch(Throwable e) {
			System.out.println("Catch");
		} finally {
			System.out.println("Finally");
		}
	}
}
