package array;

public class MultiplicationPreviouAndNext {
	public static void main(String[] args) {
		int array[] = {2, 3, 4, 5, 6};
		int n = array.length;
		multiplyPreviousAndNext(array, n);
		printArray(array);
		
	}

	static void multiplyPreviousAndNext(int array[], int n) {
		if (n <= 1)
			return;

		int prev = array[0];
		array[0] = array[0] * array[1];

		for (int i = 1; i < n - 1; i++) {
			int curr = array[i];
			array[i] = prev * array[i+1];
			prev = curr;
		}

		array[n-1] = prev * array[n-1];
	}
	
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}