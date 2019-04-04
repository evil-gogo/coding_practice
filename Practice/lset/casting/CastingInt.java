package casting;

public class CastingInt {
	public static void main(String[] args) {
		//Only Widening ||  (Narrowing || Autoboxing) is Done By Comipiler Itself
		//Manual Casting is Different
		
		char c = 10;  
		byte b = 10; 
		short s = 10;
		int i = 10;
		float f = 10;
		double d = 10;
		long l = 10;
		
		System.out.println("Primitives");

		System.out.println("char " + c);
		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("float " + f);
		System.out.println("double " + d);
		System.out.println("long " + l);
		
		
		Character C = 10;
		Byte B = 10;
		Short S = 10;
		Integer I = 10;
		Float F = 10;
		Double D = 10;
		Long L = 10;

		System.out.println("Wrappers");
		
		System.out.println("Character " + C);
		System.out.println("Byte " + B);
		System.out.println("Short " + S);
		System.out.println("Integer " + I);
		System.out.println("Float " + F);
		System.out.println("Double " + D);
		System.out.println("Long " + L);
		
	}

}
