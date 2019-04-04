package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameDemo {
	static Scanner reader;
	static Pattern p;
	static Matcher m;
	public static void main(String[] args) {
		
		reader = new Scanner(System.in);
		boolean isValidDimensions = false;
		String []dimensions;

		int row = 0, column = 0;
		while (!isValidDimensions) {
			System.out.println("Enter the Dimensions of the Matrix");
			String input = reader.next();
			p = Pattern.compile("[0-9]\\*[0-9]");
			m = p.matcher(input);
			if (m.find()) {
				dimensions = input.split("\\*");
				row = Integer.parseInt(dimensions[0]);
				column = Integer.parseInt(dimensions[1]);
				isValidDimensions = true;
			} else {
				System.out.println("!!!Wrong Dimensions. Please Enter the Dimensions of the Matrix");
			}

		}

		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for (int i = 1; i <= row * column; i++) {
			tempList.add(i);
		} 

		int [][]matrix1 = new int[row][column];
		int [][]matrix2 = new int[row][column];

		Collections.shuffle(tempList);
		fillMatrix(matrix1, tempList);
		System.out.println("Random Matrix");
		displayMatrix(matrix1);

		Collections.shuffle(tempList);
		fillMatrix(matrix2, tempList);
		System.out.println("User Matrix");
		displayMatrix(matrix2);

		Collections.shuffle(tempList);

		System.out.println("Entered Sequences");
		for (Integer integer : tempList) {
			System.out.print(integer + " ");
		}

		playGame(matrix1, matrix2, tempList);

	}



	private static void fillMatrix(int[][] matrix1, ArrayList<Integer> tempList) {
		int counter = 0;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = tempList.get(counter++);
			}
		}

	}

	static void displayMatrix(int [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void playGame(int[][] matrix1, int[][] matrix2, ArrayList<Integer> tempList) {
		System.out.println();
		int [] matrix1RowCounter = new int[matrix1.length];
		int [] matrix1ColumnCounter = new int[matrix1[0].length];
		int matrix1diagonalCounter = 0;

		int [] matrix2RowCounter = new int[matrix2.length];
		int [] matrix2ColumnCounter = new int[matrix2[0].length];
		int matrix2diagonalCounter = 0;
		boolean gameFinished = false;

		for (int i = 0; i < tempList.size() && !gameFinished; i++) {
			System.out.println("Input " + tempList.get(i) + " ");
			gameFinished = false;
			System.out.println("Computer Turn");
			gameFinished = calculateIndex(matrix1, matrix1RowCounter, matrix1ColumnCounter, matrix1diagonalCounter, tempList.get(i));
			if (gameFinished) {
				System.out.println("Computer Wins");
				break;
			}
			System.out.println("User Turn");
			gameFinished = calculateIndex(matrix2, matrix2RowCounter, matrix2ColumnCounter, matrix2diagonalCounter, tempList.get(i));
			if (gameFinished) {
				System.out.println("User Wins");
				break;
			}	
		}
	}



	private static boolean calculateIndex(int[][] matrix, int[] matrixRowCounter, int[] matrixColumnCounter, Integer matrixdiagonalCounter, Integer playedMove) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (playedMove == matrix[i][j]) {
					matrix[i][j] = 0;
					matrixRowCounter[i]++;
					matrixColumnCounter[j]++;
					if (i == j) {
						matrixdiagonalCounter++;
					}
					if (matrixRowCounter[i] == matrix.length || matrixColumnCounter[j] == matrix[0].length || matrixdiagonalCounter == matrix[0].length ) {
						
						/*for (int k = 0; k < matrix.length; k++) {
							System.out.println("Row " + k + " maatriRowCount " + matrixRowCounter[k]);
							System.out.println("Column " + k + "maatriColumnCount " + matrixColumnCounter[k]);
						}
						System.out.println("maatriDiagonalCount " + matrixdiagonalCounter);
						System.out.println("");*/
						displayMatrix(matrix);
						return true;
					}
					break;
				}
			}
		}
		
		displayMatrix(matrix);

		return false;
	}
}
