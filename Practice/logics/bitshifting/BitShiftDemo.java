package bitshifting;

public class BitShiftDemo {
	public static void main(String[] args) {
		int i = 2;
		
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
		
		System.out.println(Integer.toBinaryString(i >>> 28));
		System.out.println(i>>>28);
		
		System.out.println(Integer.toBinaryString(i << 1));
		System.out.println(i<<2);
	
	}
}
