package accolite;

public class Problem14_A extends B {
	public static String sing() {
		return "fa";
	}
	public static void main(String[] args) {
		Problem14_A a = new Problem14_A();
		B b = new Problem14_A();
		System.out.println(a.sing() + " " + b.sing());
	}
}

class B {
	public static String sing() {
		return "la";
	}
}
