package array;

public class PrintThreeLargestElement {
	public static void main(String[] args) {
		int[] array = {12, 13, 1, 10, 34, 1};
		printThreelargestElement(array);
	}

	private static void printThreelargestElement(int [] array) {
		if (array.length < 3) {
			System.out.print(" Invalid Input ");
			return;
		}
		// first > second > third
		int first, second, third;
		third = first = second = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > first) {
				third = second;
				second = first;
				first = array[i];
			} else {
				if (array[i] > second) {
					third = second;
					second = array[i];
				} else { 
					if (array[i] > third) {
						third = array[i];
					}
				}
			}
		}

		System.out.println("Three Largest Elements are " + first + " " + second + " " + third);
	}
}