package array;

public class SubSequence {
	public static void main(String[] args) {
		System.out.println("Elements of PowerSet");
		char set[] = {'1', '2', '3', '4'};
		printSubSequences(set);
	}

	private static void printSubSequences(char set[]) {

		int maxNumberOfSequences = (int) Math.pow(2, set.length);
		/* Run from counter 000..1 to 111..1*/
		for (int counter = 0; counter < maxNumberOfSequences; counter++) {
			//System.out.print("{ ");
			for (int j = 0; j < set.length; j++) {
				/* Check if jth bit in the counter is set If set then print jth element from set[] */
				if ((counter & (1 << j)) > 0) {
					System.out.print(set[j] + " "); 
				}
			}
			//System.out.println("}");
			System.out.println("");
		}
	}

	

}