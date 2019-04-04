package array;

public class NoTwoElementAdjacentMaxSum {
	public static void main(String[] args) {
		int[] array = {5, 5, 10, 100, 10, 5};
		System.out.println("Maximum Sum " + findMaxSum(array, array.length));
	}

	private static int findMaxSum(int[] array, int n) {
		int incl = array[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;
			/* current max including i */
			incl = excl + array[i];
			
			excl = excl_new;
		}
		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}
}
