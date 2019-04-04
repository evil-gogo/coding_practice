package yashna;

public class PatternThrice {
	public static void main(String[] args) {
		char character = 'a';
		int charCounter = 0, lineCounter = 0;

		while (character <= 'z') {
			for (int i = 0; i < Math.pow(2, lineCounter); i++) {
				
				if (charCounter < 3) {
					charCounter++;
				} else {
					character++;
					charCounter = 1;
				}
				if (character <= 'z')
					System.out.print(character);
				else 
					return;
			}
			lineCounter++;
			System.out.println();

		}
	}
}
