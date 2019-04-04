package accolite;

public class Problem11_Outer {
	public static int temp1 = 1;
	public static int temp2 = 2;
	public int temp3 = 3;
	public int temp4 = 4;
	
	public static class Inner{
		private static int temp5 = 5;
		
		private static int getSum() {
			return temp1 + temp2 + temp3 + temp4 + temp5;
			return 0;
		}
		
		public static void main(String[] args) {
			Problem11_Outer.Inner obj = new Problem11_Outer.Inner();
			System.out.println(obj.getSum());
		}
	}
}
