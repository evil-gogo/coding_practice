package arrays;

import java.util.Collections;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		Collections.shuffle(java.util.Arrays.asList(array));
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	} 
}
