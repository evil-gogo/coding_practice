package bt1;

import java.io.IOException;

class AirPlane {
	public AirPlane()  throws IOException, RuntimeException {
		System.out.println("AirPlane");
	}
}

class AirJet extends AirPlane {
	
}

public class Tester {
	public static void main(String[] args) {
		new AirPlane();
	}
}



