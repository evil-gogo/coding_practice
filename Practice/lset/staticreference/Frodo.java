package staticreference;


public class Frodo extends Hobbit {
	public static void main(String[] args) {
		Short myGold = 7;
		/*System.out.println(a);
		System.out.println(countGold(myGold, 6));*/
	}
}


class Hobbit {
	int a = 0;
	public int countGold(int x, int y) {
		return x + y;
	}
}
