package array;

public class PrintTwoLargestElement {
	public static void main(String[] args) {
		int[] array = {12, 35, 1, 10, 34, 1};
       
		printTwolargestElement(array);
	}
	
	private static void printTwolargestElement(int[] array) {
		if (array.length < 2) {
			System.out.print(" Invalid Input ");
			return;
		}
		//first > second
		int first, second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];
			} else { 
				if (array[i] > second) {
					second = array[i];
				}
			}
		}

		System.out.println("Two Largest Elements are " + first + " " + second);
	}

}
