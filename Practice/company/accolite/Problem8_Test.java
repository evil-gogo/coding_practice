package accolite;

abstract class demo {
	public int a;
	demo() {
		a = 10;
	}
	
	abstract public void set();
	
	abstract final public void get();
	
}

public class Problem8_Test extends demo {
	public void set(int a) {
		this.a = a;
	}
	
	final public void get() {
		System.out.println("a = + a");
	}
	
	public static void main(String[] args) {
		Problem8_Test obj = new Problem8_Test();
		obj.set(20);
		obj.get();
	}
}
