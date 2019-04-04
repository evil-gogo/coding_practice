package pretest;

public class Test2 {
	public static void main(String[] args) {
		int i[] = {1 , 2};
		change_i(i);
		System.out.println(i[0]);
	}
	
	private static  void change_i(int[] i) {
		int j[] = {2};
		i = j;
		j[0] *= 2;
	}
}
