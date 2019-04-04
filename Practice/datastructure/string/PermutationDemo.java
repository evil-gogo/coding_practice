package string;

import java.util.HashSet;

public class PermutationDemo {
	static HashSet<String> hashSet = new HashSet<>();
	public static void main(String[] args) {
		String str = "aaa";
		permutation("" , str);
		System.out.println(hashSet);
	}
	
	private static void permutation(String prefix, String str) {
		
		int n = str.length();
		if (n == 0){ 
			System.out.println(prefix);
			hashSet.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
		
		
	}
}
