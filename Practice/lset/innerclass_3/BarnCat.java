package innerclass_3;

class Outer {
	int x = 5;
	class Inner1 {
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
		out_in1.method1();
	}
}