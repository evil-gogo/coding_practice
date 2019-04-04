package st14;
abstract class Thing {
	static String s = "";
	Thing() {
		s += "t ";
	}
}

class Steel extends Thing {
	Steel() {
		s += "s "; 
	}
	
	Steel (String s1) {
		s += s1;
		new Steel();
	}
}

public class Metal extends Steel {

	Metal (String s1) {
		s += s1;
		new Steel(s);
	}

	public static void main(String args[]) {
		new Metal("tu");
		System.out.println(s);
	}
}

