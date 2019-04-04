package integercache;

public class IntegerCacheDemo {
	public static void main(String[] args) {
		Integer i3 = 127;
		Integer i4 = 127;
		if(i3 == i4)
			System.out.println("same object");
		if(i3.equals(i4))
			System.out.println("meaningfully equal");

		Integer i1 = 1000;
		Integer i2 = 1000;
		if (i1 != i2) 
			System.out.println("different objects");
		if(i1.equals(i2)) 
			System.out.println("meaningfully equal");
	
	}
}
