package exceptionhandling_10;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Testing {

	public static void go() throws IOException, JAXBException, FileNotFoundException {

	}
	
	public static void main(String[] args) throws Exception {
		try {
			go();
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (FileNotFoundException e) {//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}