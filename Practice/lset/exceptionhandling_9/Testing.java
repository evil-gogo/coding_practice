package exceptionhandling_9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Testing {

	public static void testException() throws IOException, FileNotFoundException {

	}

	public static void main(String[] args) throws Exception {
		try {
			testException();
		} catch (FileNotFoundException | IOException e) { //The exception FileNotFoundException is already caught by the alternative IOException
			e.printStackTrace();
		}
	}
}