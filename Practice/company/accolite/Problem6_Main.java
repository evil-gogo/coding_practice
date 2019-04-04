package accolite;

class Problem6_Base {
	public final void show() {
		System.out.println("Base :: show() called");
	}
}

class Problem6_Derived extends Problem6_Base {
	/*public void show() {
		System.out.println("Derived :: show() called");
	}*/
}

public class Problem6_Main {
	public static void main(String[] args) {
		Problem6_Base b = new Problem6_Derived();
		b.show();
	}
}
