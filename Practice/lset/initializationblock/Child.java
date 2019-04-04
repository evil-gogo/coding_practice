package initializationblock;

class Parent {
	static {
		System.out.println("Parent Static");
	}

	{
		System.out.println("Parent Initializer");
	}

	Parent() {
		System.out.println("Parent Constructor");
	}
}

public class Child extends Parent {
	static {
		System.out.println("Child Static");
	}

	{
		System.out.println("Child Initializer");
	}

	Child() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		//Child child = new Child();
		Parent parent = new Parent();
	}
}
