package accolite;

class Base extends Exception {
	
}

class Derived extends Base {
	
}

public class Problem16_Main {
	public static void main(String[] args) {
		try {
			throw new Derived();
		} catch (Base b) {
			System.out.println("Caught base class exception");
		} /*catch (Derived d) {
			System.out.println("Caught derived class exception");
		}*/
	}
}