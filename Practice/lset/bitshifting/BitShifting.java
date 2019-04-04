package bitshifting;

public class BitShifting {
	public static void main(String[] args) {
		byte a = 5;
		int b = 10;
		int c = a>>1; // first promoted to int before the shift operation takes place
		int d = b>>1; //value of b is same
		int e = b<<1; 
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(b);
	}
}

