package innerclass_7;

class Outer {
	int x = 5;
	
	static {
		System.out.println("Outer");
	}
	
	static class Inner1 {
		static {
			System.out.println("static_Inner1");
		}
		public static int x = 10;
		public void method1() {
			//new Outer().new Inner2().method1(); //error 
			new Outer().new Inner2().method2();
			System.out.println(this.x);
		}
		public void method2() {
			System.out.println("m2");
		}
	}
	
	class Inner2 extends Inner1{
		public int x = 20 ;
		public void method2() {
			System.out.println("m4");
		}
	}
}

public class BarnCat {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner1 inner1 = out.new Inner2();
		inner1.method1();
	}
}
