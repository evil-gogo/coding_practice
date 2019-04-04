package codingbat;

public class EvenlySpaceDemo {
	public static void main(String[] args) {
		
		System.out.println("Result " + evenlySpaced(1, 2, 4));
	}

	public static boolean evenlySpaced(int a, int b, int c) {
		if (a == b && b == c) { //if all are equal
			return true;
		} else if (a == b || a == c || b == c) { //if 1st is small 2nd is medium 3rd is Large
			return false;
		}
		return ((Math.abs(a - b) == Math.abs(b - c)) || (Math.abs(a - c) == Math.abs(a - b)) || (Math.abs(c - a) == Math.abs(b - c)));

	}
}
