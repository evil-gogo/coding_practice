package array;

public class ReverseArray {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.print("Original Array is ");
        printArray(array);
    	reverseArray(array, 0, array.length - 1);
        System.out.print("Reversed Array is ");
        printArray(array);
    }
    
    private static void reverseArray(int[] array, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start+1, end-1);
    }
 
    
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
 
}