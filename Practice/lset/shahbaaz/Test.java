package shahbaaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Boom");
		Scanner scanner;
		int [] currentStateLift;
		int numberOfPeople = 0, a = 0 , b = 0;

		int [] currentFloor = null, destination = null;

		scanner = new Scanner(System.in);
		currentStateLift = new int[10];
		
		
		String fileName = "input_file.txt";
		File file = new File(fileName);
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		String data;
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			/*while ( (data = bufferReader.readLine()) != null ) {
				System.out.println(data);
			}*/
			
			//Input Current Status of Lift
			for (int i = 0; i < currentStateLift.length; i++) {
				data = bufferReader.readLine();
				currentStateLift[i] = Integer.parseInt(data);
			}
			
			//Input Number of People Waiting
			data = bufferReader.readLine();
			numberOfPeople = Integer.parseInt(data);
			
			currentFloor = new int[numberOfPeople];
			destination = new int[numberOfPeople];
			String []temp = new String[2];
			//Input People CurrentFloor and Destination
			for (int i = 0; i < numberOfPeople; i++) {
				data = bufferReader.readLine();
				temp = data.split(" ");
				currentFloor[i] = Integer.parseInt(temp[0]);
				destination[i] = Integer.parseInt(temp[1]);
			}
			
			data = bufferReader.readLine();
			a = Integer.parseInt(data);
			b = Integer.parseInt(data);
			bufferReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		
		System.out.println("Initial");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println(currentFloor[i] + " " + destination[i]);
			
		}
		
		sort(currentFloor, destination, false);
		
		System.out.println("After First Sort");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println(currentFloor[i] + " " + destination[i]);
			
		}
		
		sort(destination, currentFloor, true);
		
		System.out.println("After Second Sort");
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println(currentFloor[i] + " " + destination[i]);
			
		}
		
	}

	//Swap Entries at Index 
	private static void swap(int [] array, int from , int to) {
		int temp = array[to];
		array[to] = array[from];
		array[from] = temp;
	}

	
	//Sort array1 and array2 on the Basis of array1
	private static void sort(int [] array1, int []array2, boolean secondSort) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					/*if (array1[j] < array2[j] && secondSort ) {
						continue;
					}*/
					swap(array1, i, j);
					swap(array2, i, j);
				}
			}
		}
	}
	public void fillInput(String fileName) {
		File file = new File(fileName);
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		String data;
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			while ( (data = bufferReader.readLine()) != null ) {
				System.out.println(data);
			}
			bufferReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	}

	
}
