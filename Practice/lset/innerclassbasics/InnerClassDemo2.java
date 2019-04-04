package innerclassbasics;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Outer2.Inner1 out_in1 = out.new Inner1();
		out_in1.method1();
		Outer2.Inner2 out_in2 = new Outer2().new Inner2();
		System.out.println(out_in2.x);
	}
}
class Outer2 {
	int x = 5;
	class Inner1 {
		public int x = 10;
		public void method1() {
			System.out.println(Outer2.x);
		}
		public void method2() {
			System.out.println("m2");
		}
	}
	class Inner2 {
		public int x = 20 ;
		public void method1() {
			System.out.println("m3");
		}
		public void method2() {
			System.out.println("m4");
		}
	}
}