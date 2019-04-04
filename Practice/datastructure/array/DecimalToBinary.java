package array;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Decimal To Binary");
		printBinaryform(8);
	}

	private static void printBinaryform(int number) {
		int remainder;

		if (number <= 1) {
			System.out.print(number);
			return;   // KICK OUT OF THE RECURSION
		}

		remainder = number %2; 
		printBinaryform(number >> 1);
		System.out.print(remainder);
	}
}