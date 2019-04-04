package staticinitializervsnonstaticinitializervsvonstructor_1;

public class Bird {
	static {
		System.out.print("static1 ");
	}
	
	{
		System.out.print("init3 ");
	}
	
	public Bird() {
		System.out.print("TestC ");
	}
	
	static {
		System.out.print("static2 ");
	}
}

