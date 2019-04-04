package differentbits;

public class CountDifferentBitsDemo {
	public static void main(String[] args) {
		int a = 8, b = 7;
		int count = countDifferentBits(a ^ b);
		System.out.println("a = " + a + " | " + Integer.toBinaryString(a));
		System.out.println("b = " + b + " | " +  Integer.toBinaryString(b));
		System.out.println("Number of Different Bits " + count);
	}
	
	private static int countDifferentBits(int n) {
	    int count = 0;
	    while (n != 0) {
	    	count += n & 1;
	        n >>= 1;
	        
	    }
	    return count;
	}
}

