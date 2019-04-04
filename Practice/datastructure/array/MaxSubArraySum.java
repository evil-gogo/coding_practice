package array;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println("Method 1 Maximum contiguous sum is " + maxSubArraySumMethod1(array));
		System.out.println("\n\nMethod 2 Maximum contiguous sum is " + maxSubArraySumMethod2(array));
	}

	private static int maxSubArraySumMethod1(int[] array) {
		int maxSoFar = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum > maxSoFar) {
					maxSoFar = sum;
				}
			}
		}
		return maxSoFar;
	}
	
	private static int maxSubArraySumMethod2(int[] array) {
		int size = array.length;
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;

		for (int i = 0; i < size; i++) {
			maxEndingHere = maxEndingHere + array[i];
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
		}
		return maxSoFar;
	}
}
