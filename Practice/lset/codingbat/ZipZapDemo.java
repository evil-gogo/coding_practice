package codingbat;

public class ZipZapDemo {
	public static void main(String[] args) {
		String s = "zzzopzop";

		System.out.println("Returns " +	zipZap(s));
	}

	private static String zipZap(String str) {
		for (int i = 0; i < str.length()- 2; i++) {
			if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
				str = str.substring(0, i + 1) + str.substring(i + 2);
			}
		}
		return str;
	}
}