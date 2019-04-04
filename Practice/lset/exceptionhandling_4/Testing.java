package exceptionhandling_4;

class Base extends Exception {

}

class Derived extends Base {
	
}

public class Testing {
	public static void main(String[] args) {
		try {
			throw new Derived();
		} catch (Base b) {
			System.out.println("Caught Base Class exception");
		} catch (Derived d) { //Unreachable catch block for Derived. It is already handled by the catch block for Base
			System.out.println("Caught Derived Class exception");
		}
	}
}