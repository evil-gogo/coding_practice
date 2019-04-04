package doha;
import java.util.ArrayList;
import java.util.HashSet;

public class Permutation {
	static ArrayList<String> anagramsList = new ArrayList<String>(); //All Combination
	static HashSet<String> hashSet = new HashSet<>(); //Unique Set
	public static void main(String[] args) {
		//String str = "aaa";
		String str = "abc";
		permutation("" , str);
		System.out.println("\nAll Possible Combination - " + anagramsList);
		System.out.println("Unique Combination - " + hashSet);
	}

	private static void permutation(String prefix, String str) { //Generating All Posible Permutation of String
		int n = str.length();
		if (n == 0){ 
			System.out.print(prefix + "  ");
			anagramsList.add(prefix); // duplicates Allowed
			hashSet.add(prefix); //duplicates not Allowed
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}
}