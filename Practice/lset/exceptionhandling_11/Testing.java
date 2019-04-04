package exceptionhandling_11;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Testing {

	public static void foo() throws IOException {

	}
	
	public static void main(String[] args) throws Exception {
		try {
			foo();
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (JAXBException e) { //Unreachable catch block for JAXBException. This exception is never thrown from the try statement body
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}