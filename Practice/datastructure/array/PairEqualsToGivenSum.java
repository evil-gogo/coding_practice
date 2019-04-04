package array;

import java.util.Arrays;

public class PairEqualsToGivenSum {

	public static void main(String[] args) {
		int array[] = {1, 4, 45, 6, 10, 8};
		int sum = 16;
		printPairsMethod1(array, sum); //nlogn
		printPairsMethod2(array, sum); //n
	}

	private static void printPairsMethod1(int[] array, int sum) {
		System.out.println("printPairsMethod1");
		int startIndex = 0;
		int endIndex = array.length - 1;

		Arrays.sort(array);

		while (startIndex < endIndex) {
			if (array[startIndex] + array[endIndex] == sum) {
				System.out.println("Pair Equivalent to Given Sum " + sum + " is (" + array[startIndex] + ", " + array[endIndex] + ")");
				break;
			}

			if (array[startIndex] + array[endIndex] < sum) {
				startIndex++;
			} else {
				endIndex--;
			}
		}    
	}

	private static void printPairsMethod2(int[] array, int sum) {
		System.out.println("printPairsMethod2");
		int MAX = 100000; // Max size of Hashmap

		// Declares and initializes the whole array as false
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < array.length; ++i) {
			int temp = sum - array[i];

			// checking for condition
			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair Equivalent to Given Sum " +	sum + " is (" + array[i] + ", " + temp + ")");
			}
			binmap[array[i]] = true;
		}
	}
}
