package accolite;

interface Anonymous {
	public int getValue();
}

public class Problem2_Outer {
	private int data = 15;
	public static void main(String[] args) {
		Anonymous inner = new Anonymous() {
			int data  = 5;
			@Override
			public int getValue() {
				// TODO Auto-generated method stub
				return data;
			}
			public int getData() {
				return data;
			}
		};
		Problem2_Outer outer = new Problem2_Outer();
		System.out.println(inner.getValue() + inner.getData() + outer.data);
	}
}