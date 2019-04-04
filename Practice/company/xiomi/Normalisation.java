package xiomi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Normalisation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path of the File");
		String pathToFile = scanner.nextLine();

		File file = new File(pathToFile);

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int input;
		try {
			while(true) {
				input = scanner.nextInt();
				System.out.println(isNormalised(input));
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.exit(0);
		}
	}

	private static boolean isNormalised(int input) {
		if (input == 1) {
			return true;
		}
		
		if (input < 10) {
			return false;
		}
		
		String inputString = "" + input;
		int sum = 0;
		for (int i = 0; i < inputString.length(); i++) {
			sum = sum + (int) Math.pow(Integer.parseInt("" + inputString.charAt(i)), 2); 
		}
		return isNormalised(sum);
	}

}
