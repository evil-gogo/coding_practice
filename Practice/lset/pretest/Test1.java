package pretest;

public class Test1 {
	public static void main(String args[]) {
		int i[] = {1, 2};
		change_i(i);
		System.out.println(i[0]);
	}
	
	public static void change_i(int i[]) {
		i[0] = 2;
		i[0] *= 2;
	}
}
