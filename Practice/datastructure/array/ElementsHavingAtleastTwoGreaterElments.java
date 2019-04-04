package array;

import java.util.Arrays;

public class ElementsHavingAtleastTwoGreaterElments {
	public static void main(String[] args) {
		System.out.println("Program to Print Elements Having At Least Two Greater Elements Than Iteself");

		int[] array = { 2, -6 , 3 , 5, 1};
		//int[] array = { 1, 1 , 1 , 1, 1}; //Method 2 Failed

		System.out.println("\n\nMethod 1 \nTime Complexity O(n^2)");
		printElementsMethod1(array);

		System.out.println("\n\nMethod 2 \nTime Complexity O(nlogn)");
		printElementsMethod2(array);

		System.out.println("\n\nMethod 3 \nTime Complexity O(n)");
		printElementsMethod3(array);
	}

	private static void printElementsMethod1(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] > array[i]) {
					count++;
					if (count >= 2) {
						System.out.print(array[i] + " ");
						break;
					}
				}
			}

		}
	}

	private static void printElementsMethod2(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length - 2; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void printElementsMethod3(int[] array) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];
			} else { 
				if (array[i] > second) {
					second = array[i];
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] < second) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
