package interviewaccolite;

public class Testing {
	public static void main(String[] args) {
		
		final String pig = "length: 10";
		System.out.println(pig.length());
		final String dog = "length: " + 10;//pig.length();
		System.out.println("Animals are equal " + pig == (dog));
		
		/*try {
			badMethod();
			System.out.println("A");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
		*/
		
		
		/*int x = -1;
		System.out.println(x>>>29);
		System.out.println(x>>>30);
		System.out.println(x>>>31);*/
		
		
		
		
		/*
		Boolean[] b1 = new Boolean[10];
		boolean[] b2 = new boolean[10];
		System.out.println(b1[1]);
		System.out.println(b2[1]);
		*/
		
		
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(0, 59);
		int total = list.get(0);
		System.out.println(total);*/
		
		
		
		
		
		/*print(5.34, 6.44);*/
		
		
		/*int j = 0;
		for (int i = 0; i < 5; i++) {
			j = j++;
			System.out.println(j);
		}
*/	}
	private static void badMethod() {
		// TODO Auto-generated method stub
		throw new Error();
	}
	public static void print(float a, float b) {
		System.out.println("Float  " + a + " " + b);
	}
	
	public static void print(double a, double b) {
		System.out.println("Double  " + a + " " + b);
	}
}

