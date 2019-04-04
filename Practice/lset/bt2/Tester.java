package bt2;

import java.io.IOException;

class AirPlane {
	
	static {
		System.out.println("static 1");
	}
	
	{
		System.out.println("init 3");
	}
	
	
	public AirPlane() {
		System.out.println("AirPlane");
	}
	
	static {
		System.out.println("static 2");
	}
}


public class Tester extends AirPlane {
	public Tester() {
		// TODO Auto-generated constructor stub
		System.out.println("Tester");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new Tester();
	}
}


//static1 static2 main init3 Airplane Tester  


