package array;

public class PowerSet {
	public static void main(String[] args) {
		System.out.println("Elements of PowerSet");
		char set[] = {'a', 'b', 'c'};
		printPowerSet(set);
	}

	private static void printPowerSet(char set[]) {
		int n = set.length;

		/* Run from counter 000..1 to 111..1*/
		for (int counter = 0; counter < (1 << n); counter++) {
			System.out.print("{ ");
			for (int j = 0; j < n; j++) {
				/* Check if jth bit in the counter is set If set then print jth element from set[] */
				if ((counter & (1 << j)) > 0) {
					System.out.print(set[j] + " "); 
				}
			}
			System.out.println("}");
		}
	}


}
