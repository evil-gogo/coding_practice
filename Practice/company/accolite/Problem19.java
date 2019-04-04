package accolite2;

public class Problem19 {
	static {
		System.out.println("Static");
	}

	{
		System.out.println("Block");
	}

	public Problem19() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		Problem19 a = new Problem19();
	
	}
}
