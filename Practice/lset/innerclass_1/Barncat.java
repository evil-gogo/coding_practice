package innerclass_1;

//import InnerClass_1.Outer.Inner2;

public class Barncat {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner1 in1 = out.new Inner1();
		Outer.Inner2 in2 = out.new Inner2();
		//Inner2 in2 = out.new Inner2();//we have to import Class 
		in1.method1();
		in1.method2();
		in2.method1();
		in2.method2();
		
	}
}
class Outer {
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