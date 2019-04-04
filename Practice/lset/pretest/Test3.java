package pretest;

public class Test3 {
//	int i[] = {0};
	public static void main(String[] args) {
		char i[] = {'c'};
		change_i(i);
		System.out.println(i[0]);
	}
	private static void change_i(char[] i) {
		// TODO Auto-generated method stub
		char j[] = {'d'};
		i = j;
	}
}
