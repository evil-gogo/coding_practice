package samsung;

import java.util.HashSet;
import java.util.Set;

public class VowelSubstrings {
	public static void main(String[] args) {
		String str = "aeoibsddaeiouudb";
		findSubstringMethod1(str);
	}

	public static void findSubstringMethod1(String str) {
		Set<Character> set = new HashSet<>();
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i)) == true) {
				set.add(str.charAt(i));
				//start++;
				if (set.size() == 5) {
					System.out.println(str.substring(start, i - start + 1) + " ");
				}
			} else {
				start = i + 1;
				set.clear();
			}
		}
	}


	private static void findSubstringMethod2(String str) {
		Set<Character> hash = null;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (isVowel(str.charAt(j)) == false)
					break;

				hash.add(str.charAt(j));

				if (hash.size() == 5) {
					System.out.println(str.substring(i, j-i+1) +  " ");
				}
			}

			hash.clear();
		}
	}

	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}
}