package innerclass_4;

class Outer {
	int x = 5;
	static {
		System.out.println("r3");
	}
	class Inner1 {
		/*static { //cant have static initializer within inner class or make class static first
			System.out.println("r3");
		}*/
		public int x = 10;
		public void method1() {
			System.out.println(Outer.this.x);
			new Inner2().method1();
		}
		public void method2() {
			System.out.println("m2");
		}
	}
	class Inner2 {
		public int x = 20 ;
		/*static {
			System.out.println("static_Inner2");
		}*/
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
		Outer out = new Outer();
		Outer.Inner1 out_in1 = out.new Inner1();
	}
}
