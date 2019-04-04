package yashna;

public class PatternTwice {
	public static void main(String[] args) {
		System.out.println("Hello");
		int no_of_stars = 1;
		//for (int i = 0; i < 5; i++) {
			for (int i = 0, j = 0; i < 5 && j < no_of_stars; j++, no_of_stars *= 2) {
				System.out.print("*");
				if (j == no_of_stars - 1) {
					j = 0;
					i++;
					System.out.print("\n");
				}
			}
			
			//no_of_stars = no_of_stars * 2;
		//}
	}
}
