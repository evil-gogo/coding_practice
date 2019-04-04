package samsung;

public class MergeSortDemo {
	public static void main(String[] args) {
		int[] array = {10, 7, 8, 9, 15};
		int size = array.length;

		System.out.println("Befor Merge Sort");
		printArray(array);

		mergesort(array, 0, size - 1);

		System.out.println("After Merge Sort");
		printArray(array);
	}

	private static void mergesort(int[] array, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			
			mergesort(array, low, middle);
			mergesort(array , middle + 1, high);
			
			merge(array, low, middle, high);
		}

	}

	private static void merge(int[] array, int low, int middle, int high) {
		 // Copy both parts into the helper array
		int[] temp = new int[array.length];
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }	
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
