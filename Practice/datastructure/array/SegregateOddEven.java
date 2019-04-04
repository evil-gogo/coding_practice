package array;

public class SegregateOddEven {
	public static void main(String[] args) {
		System.out.println("Program to Segregate Even and Odd in Array");

		int[] array = {1, 2, 1, 5, 7, 4};

		System.out.println("\n\nArray Before Segregation");
		printArray(array);

		segregateOddEven(array);

		System.out.println("\n\nArray After Segregation");
		printArray(array);	
	}

	
	private static void segregateOddEven(int[] array) {
		int left = 0, right = array.length - 1;

		while (left < right) {
			while (array[left] % 2 == 0 && left < right) {
				left++;
			}
			
			while (array[right] % 2 != 0 && left < right) {
				right--;
			}

			if (left < right) {
				 int temp = array[left];
	                array[left] = array[right];
	                array[right] = temp;
	                left++;
	                right--;			}
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");   
		} 
	}
}
