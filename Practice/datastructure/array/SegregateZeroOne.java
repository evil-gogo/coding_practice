package array;

public class SegregateZeroOne {
	public static void main(String[] args) {
		System.out.println("Program to Segregate 0 and 1 in Array");

		int[] array = {0, 1, 0, 1, 1, 1};

		System.out.println("\n\nMethod 1 Array Before Segregation");
		printArray(array);

		//segregateZeroAndOneMethod1(array);

		System.out.println("\n\nMethod 1 Array After Segregation");
		printArray(array);
		
		
		System.out.println("\n\nMethod 2 Array Before Segregation");
		printArray(array);

		segregateZeroOneMethod2(array);

		System.out.println("\n\nMethod 2 Array After Segregation");
		printArray(array);	
	}
	
	private static void segregateZeroOneMethod1(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			array[i] = 0;
		}

		for (int i = count; i < array.length; i++) {
			array[i] = 1;
		}
	}

	private static void segregateZeroOneMethod2(int[] array) {
		int left = 0, right = array.length - 1;

		while (left < right) {
			while (array[left] == 0 && left < right) {
				left++;
			}
			
			while (array[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				array[left] = 0;
				array[right] = 1;
				left++;
				right--;
			}
		}
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");   
		} 
	}
}
