package array;

public class PushZerosToEnd {
	public static void main (String[] args) {
		int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(array);
        System.out.println("Array after pushing zeros to the back: ");
        ArrayUtils.printArray(array);
	}

	private static void pushZerosToEnd(int[] array) {
		int count = 0, n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] != 0) {
				array[count++] = array[i];
			}
		} 
		while (count < n) {
			array[count++] = 0;
		}
	}

}
