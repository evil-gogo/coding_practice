package samsung;

public class MinHeapDemo {
	public static void main(String[] args) {		
		//int[] array = {12, 11, 13, 5, 6, 7};
		//int[] array = {4, 13, 54, 34, 44, 42, 96, 79, 20, 85, 80, 27, 86, 45, 85};

		int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};		
		heapSort(array);
	}

	private static void heapSort(int[] array) {
		makeHeap(array);

		printMinHeap(array);
		for (int i = array.length - 1; i >= 0; i--) {
			swap(array, i, 0);
			minHeapify(array, i, 0);
		}
			}

	private static void makeHeap(int[] array) {
		for (int i = (array.length / 2) - 1; i >= 0; i--) {
			maxHeapify(array, array.length, i);
		}
	}

	private static void minHeapify(int[] array, int size, int index) {
		int left = left(index);
		int right = right(index);
		int smallest = -1;

		if (left < size && array[left] < array[index]) {
			smallest = left;
		} else {
			smallest = index;
		}

		if (right < size && array[right] < array[smallest]) {
			smallest = right;
		}

		if (smallest != index) {
			
			/*int temp = array[0];
            array[0] = array[smallest];
            array[smallest] = temp;*/
			swap(array, index, smallest);
			minHeapify(array, size, smallest);
		}
	}

	private static void maxHeapify(int[] array, int size, int index) {
		int left = left(index);
		int right = right(index);
		int largest = index;

		if (left < size && array[left] > array[index]) {
			largest = left;
		}

		if (right < size && array[right] > array[largest]) {
			largest = right;
		}

		if (largest != index) {
			swap(array, index, largest);
			minHeapify(array, size, largest);
		}
	}

	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index2];
		array[index2] =  array[index1];
		array[index1] = temp;
	}

	private static int left(int i) {
		return (2 * i) + 1;
	}

	private static int right(int i) {
		return (2 * i) + 2;
	}

	private static void printMinHeap(int[] array) {
		for (int i = 0; i < array.length / 2 ; i++) {
			System.out.print(" PARENT : " + array[i] + " LEFT CHILD : " + array[left(i)] + " RIGHT CHILD :" + array[right(i)]);
			System.out.println();
		} 
	}

	/*static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " "); 
		}
		System.out.println();
	}*/
}