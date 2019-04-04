package interviewaccolite;

class Parent {
	static int x = 5;
	public static int getX() {
		//return 0;
		return x;
	}
}

class Child extends Parent {
	static int x = 10;
	int y = 30;
	public static int getX() {
		//return 0;
		return x;
	}
}

public class ParentChildDemo {
	public static void main(String[] args) {
		
		Parent obj = new Child();
		System.out.println(obj.x);
		//System.out.println(obj.y);
		System.out.println(obj.getX());
	}
	
	
}
