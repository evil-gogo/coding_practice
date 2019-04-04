package innerclassbasics;


class Outer1 {
	class Inner1 {
		public void method1() {
			System.out.println("m1");
		}
		public void method2() {
			System.out.println("m2");
		}
	}
	class Inner2 {
		public void method1() {
			System.out.println("m3");
		}
		public void method2() {
			System.out.println("m4");
		}
	}
}
public class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 out = new out.Inner1();
		}
}
