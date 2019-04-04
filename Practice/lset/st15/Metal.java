package st15;
public class Metal {

	
	public static void main(String args[]) {
		String s1 = "LSET";
		String s2 = "lset";
		
		String m1 = new String("Exam");
		String m2 = new String("Exam");
		
		
		if (s1 == s2) {
			System.out.println("equal1");
		}
		
		if (m1 == m2) {
			System.out.println("equal2");
		}
		
		if (m1.equals(m2)) {
			System.out.println("equal3");
		}

	}
}

