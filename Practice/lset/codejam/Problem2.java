package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		File file = new File("E:/Eclipse_Workspace/CodeJam/src/Input2.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[][] matrix = new int[8][8];

		int testCasesCount = scanner.nextInt();
		int cordinatesCount = 0;
		for (int i = 0; i < testCasesCount; i++) {
			cordinatesCount = scanner.nextInt();
			scanner.nextLine();
			String coordinates = "";
			int rowIndex = -1, colIndex = -1;
			for (int j = 0; j < cordinatesCount; j++) {
				coordinates = scanner.nextLine();
				String[] coordinates_split = coordinates.split(" ");
				rowIndex = Integer.parseInt(coordinates_split[0]);
				colIndex = Integer.parseInt(coordinates_split[1]);
				matrix[rowIndex][colIndex] = 1;
			}
			printMatrix(matrix);

			calculateLowestThinness(matrix);
		}
	}

	private static void calculateLowestThinness(int[][] matrix) {
		int parameter;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {					
					makeRectangleWithLowestThinness(matrix, i, j);
				}
			}
		}
	}

	private static int makeRectangleWithLowestThinness(int[][] matrix, int rowIndex, int colIndex) {
		int perimeter = 0;
		float minThinness = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (rowIndex != i && colIndex != j && matrix[i][j] == 1) {
					float thinness = calculateThinness(matrix, rowIndex, colIndex, i, j);

					if (thinness < minThinness ) {
						minThinness = thinness;
						perimeter = calculatePerimeter(matrix, rowIndex, colIndex, i, j);
					}
				}
			}
		}
		return perimeter;
	}

	private static int calculatePerimeter(int[][] matrix, int rowIndex, int colIndex, int i, int j) {
		return 2 * (Math.abs(rowIndex - i) + Math.abs(colIndex - j));
	}

	private static float calculateThinness(int[][] matrix, int rowIndex, int colIndex, int i, int j) {
		// TODO Auto-generated method stub
		int a = Math.abs(rowIndex - i);
		int b = Math.abs(colIndex - j);

		//System.out.println("a " + a + " b " + b);
		if (a > b) {
			return (float)(b / a);
		} else {
			return (float)(a / b);
		}
	}

	public static void printMatrix(int[][] matrix) {
		System.out.print("\n\t ");
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + "\t ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n\t ");
	}


}
