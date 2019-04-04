package goldmansachs;

public class LargestSubArrayWithSumZero {
	public static void main(String args[]) { 
		int[] array = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.println("Length of the longest 0 sum subarray is " + maxLen(array));     
	}
	
	private static int maxLen(int[] array) {
		int maxLenth = 0, currentSum = 0; 
		for (int i = 0; i < array.length; i++) {
			currentSum = 0;
			for (int j = i; j < array.length; j++) {
				currentSum += array[j];
				if (currentSum == 0) {
					maxLenth = Math.max(maxLenth, j - i + 1);
				}
			}
		}
		return maxLenth;
	}
}