package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		File file = new File("E:/Eclipse_Workspace/CodeJam/src/Input.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[][] matrix = new int[8][8];

		int testCasesCount = scanner.nextInt();
		int cellsInfectedCount = 0;
		for (int i = 0; i < testCasesCount; i++) {
			cellsInfectedCount = scanner.nextInt();
			scanner.nextLine();
			String infectedCell = "";
			int rowIndex = -1, colIndex = -1;
			for (int j = 0; j < cellsInfectedCount; j++) {
				infectedCell = scanner.nextLine();
				String[] indexes = infectedCell.split(" ");
				//System.out.println("i = " + indexes[0] + " j = " + indexes[1]);
				rowIndex = Integer.parseInt(indexes[0]) - 1;
				colIndex = Integer.parseInt(indexes[1]) - 1;
				matrix[rowIndex][colIndex] = 1;
			}
			printMatrix(matrix);
			int time = checkInfection(matrix);
			System.out.println("Time " + time);
			printMatrix(matrix);
		}

	}


	public static int checkInfection(int[][] matrix) {
		System.out.println("checkInfection");
		int tempRow = -1, tempCol = -1;
		boolean isInfectionSpreaded = false, isInfectionDetected = false;
		for (int i = 0; i < matrix.length; i++) {
			tempRow = i;
			for (int j = 0; j < matrix[i].length; j++) {
				tempCol = j;
				if (matrix[i][j] != 1) {
					isInfectionSpreaded = checkAdjacentCells(matrix, tempRow, tempCol);
				}
				if (isInfectionSpreaded) {
					matrix[i][j] = 1;
					printMatrix(matrix);
					isInfectionDetected = true;
				}
			}
		}
		if (isInfectionDetected) {
			System.out.println("Infection Detected");
			return 1 + checkInfection(matrix);
		} else {
			System.out.println("Infection Not Detected");
			return 0;
		}
		
	}

	private static boolean checkAdjacentCells(int[][] matrix, int tempRow, int tempCol) {
		
		int count = 0;
		for (int i = tempRow - 1; i < tempRow + 3; i++) {
			for (int j = tempCol - 1; j < tempCol + 3; j++) {

				if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length) {
					if (matrix[i][j] == 1 && Math.abs(tempRow - i) + Math.abs(tempCol - j) == 1) {
						count++;
						if (count >= 2) {
							return true;
						}
					}					
				}
			}
		}
		return false;
	}

	public static void printMatrix(int[][] matrix) {
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
