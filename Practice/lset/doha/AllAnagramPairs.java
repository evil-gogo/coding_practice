package doha;

public class AllAnagramPairs {
	public static void main(String[] args) {
		String arr[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs"};
		findAllAnagrams(arr);
	}

	private static void findAllAnagrams(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (areAnagram(arr[i].toLowerCase(), arr[j].toLowerCase())) {
					System.out.println(arr[i] + " is anagram of " + arr[j]); 
				}
			}
		}
	}

	private static boolean areAnagram(String str1, String str2) {
		int[] count = new int[26];
		int i;
		for (i = 0; i < str1.length() && i < str2.length();  i++) { //it will run till equal length
			count[str1.charAt(i) - 'a']++;
			count[str2.charAt(i) - 'a']--;
		}

		if (i > str1.length() || i > str2.length()) { //if str1 or str2 length is greater then other & vice versa  
			return false;
		}

		for (i = 0; i < count.length; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}
}