package subex;

public class MaximumNumber {
	public static void main(String[] args) {

		String number = "5454654860";
		//String number = "13458";
		String output = number.charAt(0)+"";
		for (int i = 1; i < number.length(); i++) {
			output = getBiggestPossibleNumber(output, number.charAt(i)+"");
			System.out.println(output);
		}
		System.out.println(output);
	}

	private static String getBiggestPossibleNumber(String X, String Y) {
		System.out.println("- " + X + " " + Y);
		String XY = X.concat(Y);
		String YX = Y.concat(X);

		if (XY.compareTo(YX) > 0) {
			return XY;
		} else {
			return YX;
		}

	}
}