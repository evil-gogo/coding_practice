package matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MatrixDemo {

	public static void main(String[] args) {
		int matrix[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};

		System.out.println("Initial Array");
		displayArray(matrix);

		Random r = new Random();

		List list = Arrays.asList(matrix);
		Collections.shuffle(list, r);

		int[][] unshuffled = (int[][]) list.toArray(new int[4][4]);

		System.out.println("After Shuffle Array");
		shuffle(unshuffled);


	}

	static void shuffle(int[][] matrix){
		Random r = new Random();
		for (int i = matrix.length - 1 ; i > 0; i--) {
			for (int j = matrix[i].length-1; j >0; j--) {
				int m = r.nextInt(i + 1);
				int n = r.nextInt(j + 1);

				int temp = matrix[i][j];
				matrix[i][j] = matrix[m][n];
				matrix[m][n] = temp;
			}
		}
		displayArray(matrix);

	}

	static void displayArray(int [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int getLeft(int [][] matrix, int x, int y) {
		if (x < matrix[0].length) {
			return matrix[x + 1][y];
		} else {
			return -1;
		}

	}

	static int getRight(int [][] matrix, int x, int y) {
		if (x >= 0) {
			return matrix[x - 1][y];
		} else {
			return -1;
		}
	}

	static int getTop(int [][] matrix, int x, int y) {
		if (y >= 0) {
			return matrix[x][y - 1];
		} else {
			return -1;
		}
	}

	static int getBottom(int [][] matrix, int x, int y) {
		if (y < matrix.length) {
			return matrix[x][y + 1];
		} else {
			return -1;
		}
	}

}
