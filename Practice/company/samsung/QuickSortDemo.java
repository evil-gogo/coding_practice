package samsung;

public class QuickSortDemo {
	public static void main(String[] args) {
		int[] array = {10, 7, 8, 9, 15};
		int size = array.length;

		System.out.println("Befor Quick Sort");
		printArray(array);
		
		quicksort(array, 0, size - 1);
		
		System.out.println("After Quick Sort");
		printArray(array);
	}
	
	static void quicksort(int[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			quicksort(array, low, pivot - 1);
			quicksort(array, pivot + 1, high);
		}
	}

	static int partition(int[] array, int low, int high) {
		int pivot = array[high]; 
		int index = low - 1; 
		for (int i = low; i < high; i++) {
			// If current element is smaller than or
			// equal to pivot
			if (array[i] <= pivot) {
				index++;
				swap(array, index, i);
			}
		}

		swap(array, index + 1, high);
		printArray(array);
		return index + 1;
		
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index2];
		array[index2] =  array[index1];
		array[index1] = temp;
	}


	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	
}