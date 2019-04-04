package accolite;

public class Problem15_Run {
	public static void main(String[] args) {
		Problem15_OuterClass obj = new Problem15_OuterClass();
		try {
			Class.forName("Problem15_OuterClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
