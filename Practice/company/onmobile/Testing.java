package onmobile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
	public static void main(String[] args) {
		System.out.println("OnMobile");
		String vowels[] = {"a", "e" , "i", "o", "u"};
		String s = "aeiaaioooaa";
		longestSubsequence(s);

	}

	private static void longestSubsequence(String str) {

		Matcher m = Pattern.compile("(?:(a)|(e)|(i)|(o)|(u)|.)+", Pattern.CASE_INSENSITIVE)
				.matcher(str);

		if (m.matches() &&
				m.group(1) != null &&
				m.group(2) != null &&
				m.group(3) != null &&
				m.group(4) != null &&
				m.group(5) != null) {
			System.out.println("All vowels matched!");
		} else {
			System.out.println("Not all vowels matched.");
		}
		String vowelsInPhrase = str.toLowerCase().replaceAll("[^aeiou]", "");
		String temp = vowelsInPhrase;
		String usedVowels = "";
		while(temp.length() > 0){
			usedVowels += temp.substring(0, 1);
			temp = temp.replaceAll(temp.substring(0, 1), "");
		}
		if(usedVowels.length() == 5){
			String result = "At least one occurrence of each vowel.\n";
		}
	}

}
