package comparision;

public class Comparison {
		public static void main(String args[]) { 
			System.out.println("main");
			String s1 = new String("Test One"); 
			String s2 = new String("Test One"); 
			if ( s1 == s2 ) { 
				System.out.println("Both are equal 1"); 
			} 
			
			if ( s1.equals(s2 )) { 
				System.out.println("Both are equal 2"); 
			} 
			
			Boolean b = new Boolean(true); 
			Boolean b1 = new Boolean(false); 
			if ( b.equals(b1) ) { 
				System.out.println("These wrappers are equal"); 
			} 
		} 
	}
