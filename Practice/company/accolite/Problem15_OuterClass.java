package accolite;

public class Problem15_OuterClass {
	static {
		System.out.println("Static Outer Class Loaded");
	}
	
	{
		System.out.println("Instance Outer Class Loaded");	
	}
	
	public static class InnerClass {
		static {
			System.out.println("Static Inner Class Loaded");
		}
		
		{
			System.out.println("Instance Inner Class Loaded");
		}
	}
}

