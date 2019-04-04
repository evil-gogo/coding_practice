package codingbat;

public class MaxSpanDemo {
	public static void main(String[] args) {
		//int array [] = {1, 2, 1, 1, 3, 2, 1};
		int array [] = {1, 2, 3,4};
		maxSpan(array);
	}

	private static int maxSpan(int[] array) {
		int difference = 0 , maxSpanValue = 0, leftPos = 0, rightPos = 0, number;
		for (int i = 0; i < array.length; i++) {
			number = array[i];
			leftPos = i;
			for (int j = array.length - 1; j >= 0; j--) {
				if (array[j] == number) {
					rightPos = j;
					break;
				}
			}
			difference = rightPos - leftPos + 1;
			maxSpanValue = Math.max(difference, maxSpanValue);
		}
		return maxSpanValue;
	}
}
