package goldmansachs;

public class CountCombination {
	public static void main(String[] args) {
		String digits = "2112";

		System.out.println("Count is " + countDecodingDP(digits, digits.length()));
	}

	private static int countDecodingDP(String digits, int n) {
		int[] count = new int[n + 1];
		count[0] = 1;
		count[1] = 1;

		for (int i = 2; i <= n; i++) {
			count[i] = 0;

			// If the last digit is not 0, then last digit must add to
			// the number of words
			if (digits.charAt(i - 1) > '0') {
				count[i] = count[i - 1];
			}

			// If second last digit is smaller than 2 and last digit is
			// smaller than 7, then last two digits form a valid character
			if (digits.charAt(i - 2) < '2' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) < '7')) {
				count[i] += count[i - 2];
			}
		}
		return count[n];
	}
}
