package innerclass_9;

import innerclass_9.Outer.Inner2;

public class Cafeteria {

	public static void main(String[] args) {

		Outer out =new Outer() {

			Outer.Inner2 abc = new Outer.Inner2() {

				public void method1() {
					System.out.println(Outer.x);
					System.out.println("m1");
				}
			};
		};
		out.abc.method1();
	}
}

class Outer {

	public Object inner2;
	static int x = 5;
	static class Inner2 extends Outer{

		public  int x = 20 ;
		public void method1() {

			System.out.println("m3");
		}

		public void method2() {
			System.out.println("m4");
		}
	}  
}
