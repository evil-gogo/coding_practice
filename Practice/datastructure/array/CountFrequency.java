package array;

public class CountFrequency {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 3, 2, 5};
		printfrequency(array);
	}
	
	private static void printfrequency(int[] array) {
		int size = array.length;
		for (int j = 0; j < size; j++) {
			array[j] = array[j] - 1;
		}

		for (int i = 0; i < size; i++) {
			array[array[i] % size] = array[array[i] % size] + size;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(i + 1 + "->" + array[i] / size);
		}
	}
}

