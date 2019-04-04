package assertion;

public class Assertion {
	public static int y;
	public static void foo(int x) 
	{
		System.out.print("foo ");
		y = x;
	}
	public static int bar(int z) 
	{
		System.out.print("bar ");
		return y = z;
	}
	public static void main(String [] args ) 
	{
		int t = 0;
		assert t > 0 : bar(7);
		//Uncomment assert t > 1 : foo(8); //  foo(8) is an expression that has not a value. (It cannot be an invocation of a method that is declared void.)
		System.out.println("done ");
	}
}
