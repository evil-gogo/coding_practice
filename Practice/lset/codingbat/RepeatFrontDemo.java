package codingbat;

public class RepeatFrontDemo {
	public static void main(String[] args) {
		String s = "Chocolate";
		int n = 4;
		System.out.println("Returned String " + repeatFront(s , n));
	}

	private static String repeatFront(String inputString, int n) {
		String s = "";
		while (n >= 0) {
			s =  s + inputString.substring(0, n);
			n--;
		}
		return s;
	}
}