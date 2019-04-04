package pretest;

public class Parent {
	final void abc(){
		System.out.println("fsf");
	}
}

class Child extends Parent {
	/*void abc(){
		
	}
	*/
	public static void main(String[] args) {
		Child child = new Child();
		child.abc();
		
	}
}
