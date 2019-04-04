package accolite;

public class Problem1_Test {
	static String str = "a";
	static void A() {
		try {
			str += "b";
			B();
		} catch (Exception e) {
			str += "c";
		}
	}
	
	static void B() throws Exception {
		try {
			str += "d";
			C();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "e";
		}
	}
	
	private static void C() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	} 
	
	public static void main(String[] args) {
		A();
		System.out.println(str);
	}
}
