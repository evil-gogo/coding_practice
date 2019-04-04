package goldmansachs;

public class Radius {
	/*
	 * Complete the funmainction below.
	 */
	public static void main(String[] args) {
		int count = findNumberofIntegerPoints(5);
		System.out.println(count);
	}

	static int findNumberofIntegerPoints(int radius) {
		System.out.println();
		int x = 0 - radius;
		int y = radius;
		int counter = 0;
		for(int i = x ; i <= y ; i++) {
			for (int j = x ; j <= y; j++) {
				if (isOnCircumFerence(i, j, radius)) {
					counter++;
				}
			}
		}
		return counter;
	}
	static boolean isOnCircumFerence(int x, int y, int radius) {
		if (( (x * x) + (y * y) ) == (radius * radius) ) {
			System.out.println(x + "  " + y);
			return true;
		}
		return false;
	}


}
