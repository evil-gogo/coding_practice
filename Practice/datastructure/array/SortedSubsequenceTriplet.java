package array;

public class SortedSubsequenceTriplet {
	public static void main(String[] args) {
		int[] array = {12, 11, 10, 5, 6, 2, 30};
        findSortedSubsequenceTriplet(array);
	}

	private static void findSortedSubsequenceTriplet(int[] array) {
		int n = array.length;
		int max = n - 1;
		int min = 0; 
		int i;
		int[] smaller = new int[n];
		smaller[0] = -1;  // first entry will always be -1
		for (i = 1; i < n; i++)	{
			if (array[i] <= array[min])	{
				min = i;
				smaller[i] = -1;
			} else {
				smaller[i] = min;
			}
		}
		ArrayUtils.printArray(smaller);
		int[] greater = new int[n];
		greater[n - 1] = -1;  // last entry will always be -1
		for (i = n - 2; i >= 0; i--) {
			if (array[i] >= array[max]) {
				max = i;
				greater[i] = -1;
			} else {
				greater[i] = max;
			}
		}

		ArrayUtils.printArray(greater);
		// Now find a number which has both a greater number
		// on right side and smaller number on left side
		for (i = 0; i < n; i++)	{
			if (smaller[i] != -1 && greater[i] != -1) {
				System.out.print(array[smaller[i]] + " " + array[i] + " " + array[greater[i]]);
				return;
			}
		}

		System.out.println("No such Triplet Found");
		return;
	}
}
