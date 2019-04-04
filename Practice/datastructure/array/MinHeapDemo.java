package array;

public class MinHeapDemo {
	public static void main(String[] args) {		
		int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};		
		heapSort(array);
		printMinHeap(array);
		ArrayUtils.printArray(array);
	}

	private static void heapSort(int[] array) {
		buildHeap(array);
		for (int i = array.length - 1; i >= 0; i--) {
			swap(array, i, 0);
			heapify(array, i, 0);
		}
	}

	private static void buildHeap(int[] array) {
		for (int i = (array.length ) / 2; i >= 0; i--) {
			heapify(array, array.length, i);
		}
	}

	private static void heapify(int[] array, int size, int index) {
		int left = left(index);
		int right = right(index);
		int smallest = index;

		if (left < size && array[left] < array[index]) {
			smallest = left;
		} 

		if (right < size && array[right] < array[smallest]) {
			smallest = right;
		}

		if (smallest != index) {
			swap(array, index, smallest);
			heapify(array, size, smallest);
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
}