package accolite2;
class Problem12_Temp {
	static int x = 8;
	public static void display() {
		System.out.println(x);
	}
	
}

class Problem12_Child extends Problem12_Temp {
	static int y = 9;
	public static void display() {
		System.out.println(y);
	}
}
public class Problem12 {
	
	public static void main(String[] args) {
		Problem12_Temp a = new Problem12_Temp();
		Problem12_Child b = new Problem12_Child();
		
		a.x = 1;
		b.y = 2;
		b.x = 2;
		a.display();
		b.display();
		
	
	}
}
