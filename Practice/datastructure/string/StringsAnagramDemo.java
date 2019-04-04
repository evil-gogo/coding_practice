package string;

public class StringsAnagramDemo {
	public static void main(String[] args) {
		String string1 = "triangle";
		String string2 = "integral";
		System.out.println("Is Anagram - " + isAnagram(string1, string2));
	}

	private static boolean isAnagram(String string1, String string2) {
		char[] array = new char[26];
		
		if (string1.length() != string2.length()) {
			return false;
		}
		
		for (int i = 0; i < string1.length() && i < string2.length(); i++) {
			array[string1.charAt(i) - 'a']++;
			array[string2.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				return false;
			}
		}
		
		return true;	
	}
}
