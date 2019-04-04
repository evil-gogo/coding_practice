package codingbat;

public class MixStrings {

	public static void main(String[] args) {

		String str1 = "Hi";
		String str2 = "There";
		System.out.println(mixString(str1, str2));
	}

	public static String mixString(String a, String b) {
		String str = "";
		int counter = 0;
		while (counter < a.length() || counter < b.length()) {

			if (counter < a.length()) {
				str = str + a.charAt(counter);
			}
			if (counter < b.length()) {
				System.out.println("b");
				str = str + b.charAt(counter);
			}
			counter++;
		}
		return str;
	}

}