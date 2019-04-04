package bitwiseoperators;

public class BitWiseDemo {
	public static void main(String [] args) 
	{
		int x = 11 & 9;
		System.out.println(x);
		int y = x ^ 3;
		System.out.println(y);
	        System.out.println( y | 12 );
	        
	        
	        int i = 0;
	        System.out.println(++i + --i + i++ + i--);
	        i = ++i + --i + i++ + i--;
	        
	        System.out.println(i);
	}
}
