package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		File file = new File("E:/Eclipse_Workspace/CodeJam/src/Input5.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int testCasesCount = scanner.nextInt();
		scanner.nextLine();
		int noOfCivilizations, noOfExplorationYears;
		String noCivilization_Year = "";
		String[] noCivilization_Year_Split;
		String shipExplorationInfo;
		int cordX, cordY, dx, dy;
		int noOfCapsules;
		for (int i = 0; i < testCasesCount; i++) {
			int[][] matrix = new int[11][11];
			noOfCapsules = 0;
			noOfCivilizations = 0;
			noOfExplorationYears = 0;
			noCivilization_Year = scanner.nextLine();
			noCivilization_Year_Split = noCivilization_Year.split(" ");

			noOfCivilizations = Integer.parseInt(noCivilization_Year_Split[0]);
			noOfExplorationYears = Integer.parseInt(noCivilization_Year_Split[1]);

			for (int j = 0; j < noOfCivilizations; j++) {
				shipExplorationInfo = scanner.nextLine();
				String[] shipExplorationInfo_Split = shipExplorationInfo.split(" ");
				cordX = Integer.parseInt(shipExplorationInfo_Split[0]);
				cordY = Integer.parseInt(shipExplorationInfo_Split[1]);
				dx = Integer.parseInt(shipExplorationInfo_Split[2]);
				dy = Integer.parseInt(shipExplorationInfo_Split[3]);
				
				matrix[cordX][cordY] = j + 1; 

				for (int k = 0; k < noOfExplorationYears; k++) {
					cordX = cordX + dx;
					cordY = cordY + dy;
					matrix[cordX][cordY] = j + 1;
				}
			}

			printMatrix(matrix);
			for (int j = 0; j < noOfCivilizations; j++) {
				noOfCapsules = noOfCapsules + calculateCapsules(matrix, j + 1);
				
			}
			System.out.println("Number of Capsules " + noOfCapsules+ "\n");	
		}
	}

	private static int calculateCapsules(int[][] matrix, int civilization) {
		int noOfCapsules = 0, tempRow = -1, tempCol = -1;
		int detectedCivilization = 0;
		for (int i = 0; i < matrix.length; i++) {
			tempRow = i;
			for (int j = 0; j < matrix[i].length; j++) {
				tempCol = j;
				if (matrix[i][j] == civilization) {
					detectedCivilization = checkAdjacentCells(matrix, civilization, tempRow, tempCol);
					noOfCapsules = noOfCapsules + detectedCivilization;	
				}
			}
		}
		return noOfCapsules;
	}

	private static int checkAdjacentCells(int[][] matrix, int civilization, int tempRow, int tempCol) {
		int detectedCivilization = 0;
		for (int i = tempRow - 2; i <= tempRow + 2; i++) {
			for (int j = tempCol - 2; j <= tempCol + 2; j++) {
				if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length) {
					if (matrix[i][j] != civilization && matrix[i][j] != 0) {
						detectedCivilization++;
					}					
				}
			}
		}
		return detectedCivilization;
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


	public static void printMatrixCord(int[][] matrix) {
		System.out.println("\nPrintMatrixCord");
		for (int i = matrix.length - 1; i >=0; i--) {
			System.out.print(i + "\t ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\n\t ");
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}	

}
