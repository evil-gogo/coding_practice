package pretest;

public class Test4 {
	int i[] = {0};
	public static void main(String[] args) {
		byte b = 3;
		byte c = 12;
		int i[] = {1};
		Test4 test2 = new Test4();
		
		test2.change_i(i);
		System.out.println(i[0]);
		System.out.println(test2.i[0]);
	}
	
	private  void change_i(int[] i) {
		int j[] = {2};
		this.i = j;
		j[0]*=2;
		
		System.out.println("sdgsdg");
	}
}
