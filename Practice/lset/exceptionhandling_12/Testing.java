package exceptionhandling_12;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Testing {
	public static void foo() throws NullPointerException {
	
	}
	
	public static void bar() {

	}
	
	public static void main(String[] args) throws Exception {
		try {
			bar();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		foo();
	}
	
}