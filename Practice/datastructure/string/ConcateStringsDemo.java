package string;

import java.util.HashMap;

public class ConcateStringsDemo {
	public static void main(String[] args) {
		String string1 = "abcs";
		String string2 = "cxzca";
		System.out.println(concateString(string1, string2));
	}

	private static String concateString(String string1, String string2) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		String string = "";
		
		for (int i = 0; i < string2.length(); i++) {
			hashMap.put(string2.charAt(i), 1);
		}
		
		for (int i = 0; i < string1.length(); i++) {
			if (hashMap.containsKey(string1.charAt(i))) {
				hashMap.put(string1.charAt(i), hashMap.get(string1.charAt(i)) + 1);
			} else {
				string = string + string1.charAt(i);
			}
		}
		
		for (int i = 0; i < string2.length(); i++) {
			if (hashMap.get(string2.charAt(i)) == 1) {
				string = string + string2.charAt(i);
			}
		}
		return string;
	}
}
