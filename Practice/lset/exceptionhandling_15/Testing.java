package exceptionhandling_15;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Testing {
	
	public static void main(String[] args) throws Exception {
		try {
			go();
		} catch (IOException | Exception e) { //The exception IOException is already caught by the alternative Exception
			e.printStackTrace();
		}
	}
	public static void go() throws IOException, JAXBException, FileNotFoundException {
		
	}
	
}