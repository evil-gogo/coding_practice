package array;

public class ArrayRotation {

	public static void main (String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int d = 2;
		System.out.print("Original Array is ");
		ArrayUtils.printArray(array);
	    leftRotate(array, d);
	    System.out.println("Array After Rotated Left by " + d + " Elements");
	    ArrayUtils.printArray(array);
	}

    private static void leftRotate(int[] array, int d) {
        for (int i = 0; i < d; i++) {
            leftRotatebyOne(array);
        }
    }
 
    private static void leftRotatebyOne(int[] array) {
        int i, temp;
        temp = array[0];
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = temp;
    }
}


