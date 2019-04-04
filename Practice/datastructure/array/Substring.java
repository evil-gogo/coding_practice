package array;

public class Substring {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};

		System.out.println("All Non-empty SubStrings");
		printSubString(arr);
	}

	private static void printSubString(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(array[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
