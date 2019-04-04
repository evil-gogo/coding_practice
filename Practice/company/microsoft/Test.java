package microsoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		/*int matrix[][] = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 0}
		};*/
		int matrix[][] = {
				{0, 0, 0},
				{0, 1, 0}
		};


		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {

					setOneAtIndex(matrix, i, j);


				}
			}
		}

		System.out.println("Initial Array");
		displayArray(matrix);
		
		
		
		
		String [] test = {"Hi" , "Farah", "Ryan", "Farah", "Ryan"};
		String one = new String();
		for (int i = 0; i < test.length; i++) {
			one = one + test[i] + " ";
		}
		System.out.println(one+ "\t");
		int prevCount = 0;
		String prevWinner = test[0];
		for (int i = 0; i < test.length; i++) {
			String string = one;
			int count = string.length() - string.replaceAll(test[i], "&").length();
			if (count > prevCount) {
				if (prevWinner.charAt(0) < test[i].charAt(0)) {
					prevWinner = test[i];
				}
			}
		}
		
		System.out.println("fsfsdfsd" +prevWinner);
		String string = "aaab";
		int count = string.length() - string.replaceAll("a", "").length();
		

		/*Random r = new Random();

		List list = Arrays.asList(matrix);
		Collections.shuffle(list, r);

		int[][] unshuffled = (int[][]) list.toArray(new int[4][4]);

		System.out.println("After Shuffle Array");
		shuffle(unshuffled);


*/	}

	private static void setOneAtIndex(int[][] matrix, int row, int col) {
		System.out.println("i j " + row + " " +  col);
		for (int i = 0 ; i < matrix.length ; i++) {
			matrix[i][col] = 1;
		}
		System.out.println("Row Done \n");
		displayArray(matrix);
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 1;
		}
		System.out.println("Col Done\n");
		displayArray(matrix);
		


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
