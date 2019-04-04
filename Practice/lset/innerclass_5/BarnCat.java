package innerclass_5;

class Outer {
	int x = 5;
	static {
		System.out.println("Outer");
	}
	static class Inner1 {
		static {
			System.out.println("static_Inner1");
		}
		public int x = 10;
		public void method1() {
			new Inner2().method1();
		}
		public void method2() {
			System.out.println("m2");
		}
	}
	
	static class Inner2 {
		public int x = 20 ;
		static {
			System.out.println("static_Inner2");
		}
		public void method1() {
			System.out.println(new Inner1().x);
		}
		public void method2() {
			System.out.println("m4");
		}
	}
}

public class BarnCat {
	public static void main(String[] args) {
		Outer out =new Outer();
		Outer.Inner1 inner1 = new Outer.Inner1();
		Outer.Inner2 inner2;
	}
}
