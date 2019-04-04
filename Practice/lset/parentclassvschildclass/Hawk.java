package parentclassvschildclass;
class Bird {
	int i = 14;
}

class Raptor extends Bird {
	int i = 28;
}

public class Hawk extends Raptor {
	int i = 7;
	public static void main(String[] args) {
		System.out.print(((Raptor)new Hawk()).i+" ");
		System.out.print(((Bird)new Hawk()).i);
	}
}







