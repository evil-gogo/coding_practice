package accolite;

public class Problem10_Test {
	private static boolean done = true;
	private int count = 23;
	private void doSomething();
	public static void run() {
		count++;
		done = false;
		this.doSomething();
		doSomething();
	}
} 	