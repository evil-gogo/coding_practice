package st18;

public class Voltage {
	
	static int number = 10;
	
	{
		number = 30;
	}
	
	static {
		number = 40;
	}
	
	public static void main(String args[]) {
		System.out.println( ( (Voltage)new Object() ).number );
	}
}

