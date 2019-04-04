package staticdemo;


public class StaticDemo {

	static int j = func();

	static int func(){
		return i ;
	}

	{
		i = 9 ;

	}

	static {
		i = 7 ;
	}

	static int i = 59 ;


	public static void main(String[] args) {
		System.out.println(j);
		System.out.println(i);
	}
}