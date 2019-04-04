package array;

import java.util.Arrays;

public class MinimumDifferencePair {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 19, 18, 25};
		System.out.println("Minimum difference is " + findMinDiff(array));
	}
	
	private static int findMinDiff(int[] array) {
		Arrays.sort(array);

		int diff = Math.abs(array[1] - array[0]);

		for (int i = 2; i < array.length - 1; i++) {
			if (array[i+1] - array[i] < diff) {
				diff = array[i+1] - array[i];
			}
		}

		return diff;
	}
}
