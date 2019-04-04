package exceptionhandling_16;

import java.io.IOException;

public class Testing {
	
	void method(Exception e) {
		System.out.println(e + "Caught in Exception Method");
	}
	
	void method(ArithmeticException ae) {
		System.out.println(ae + "Caught in ArithmeticException Method");
	}
	
	public static void main(String[] args) {
		Testing obj = new Testing();
		obj.method(new ArithmeticException());
		obj.method(new IOException());
	}
	
}