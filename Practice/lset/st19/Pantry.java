package st19;

class Pantry {
	public static void main(String args[]) {
		Class1 c = new Class1();
		System.out.println("Pantry");
	}
	
	static class Class1 {
	
		{ 
			System.out.println("b1 ");
		}
		
		public Class1() {
			this("test");
			System.out.println("b2 ");
		}
		
		public Class1(String x) {
			
			System.out.println("X1 ");
		}
	}
	
	static class Raptor extends Class1 {
		
		static {
			System.out.println("r1 ");
		}
		
		public Raptor() {
			System.out.println("r3 ");
		}
		
		static {
			System.out.println("r4 ");
		}
	}
}

