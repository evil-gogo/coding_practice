package codingbat;

public class PlusOutDemo {
	public static void main(String[] args) {
		String s = "12xy34";
		String word = "xy";
		System.out.println("Returns " + plusOut(s, word));
	}

	public static String plusOut(String str, String word) {
		String output = "";
		int len = str.length();
		int i = 0;

		while (i < len) {
			if (str.substring(i).startsWith(word)) {
				output += word;
				i += word.length();
			} else {
				output += "+";
				i++;
			}
		}
		return output;
	}
}