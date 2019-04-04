package accolite;


interface A {

}

class B {

}

class C extends B implements A {

}

class D implements A {

}

public class Problem20_Test {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		
		A a = d;
		d = c;
		c = d;
		d = (D)c;
	}
}
