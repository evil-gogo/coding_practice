package accolite;

public class Problem18_Test {
	public static void main(String[] args) {
		Problem5_Test t1 = new Problem5_Test();
		Problem5_Test t2 = m1(t1);
		Problem5_Test t3 = new Problem5_Test();
		t2 = t3;
	}
	static Problem5_Test m1(Problem5_Test temp) {
		temp = new Problem5_Test();
		return temp;
	}
}
