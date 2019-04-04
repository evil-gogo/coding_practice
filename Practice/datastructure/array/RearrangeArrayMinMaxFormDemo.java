package array;

import java.util.Arrays;

public class RearrangeArrayMinMaxFormDemo {
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println("Before Array ");
		System.out.println(Arrays.toString(array));

		//rearrangeMethod1(array, array.length);
		rearrangeMethod2(array, array.length);

		System.out.println("Modified Array ");

		System.out.println(Arrays.toString(array));
	}

	private static void rearrangeMethod1(int[] array, int n) {
		int temp[] = new int[n];

		int small = 0, large = n - 1;

		boolean flag = true;


		for (int i = 0; i < n; i++) {
			if (flag) {
				temp[i] = array[large--]; 
			} else {
				temp[i] = array[small++];
			}
			flag = !flag;
		}
		array = temp.clone();
	}

	private static void rearrangeMethod2(int[] array, int n) {
		int minIdx = 0, maxIdx = n - 1;
		int max = array[n - 1] + 1 ;

		for (int i = 0; i < n ; i++) {
			if (i % 2 == 0) {
				array[i] += (array[maxIdx] % max ) * max;
				maxIdx--;
			} else {
				array[i] += (array[minIdx] % max ) * max;
				minIdx++;
			}
		}
		for (int i = 0 ; i < n; i++) {
			array[i] = array[i] / max ;
		}
	}
}