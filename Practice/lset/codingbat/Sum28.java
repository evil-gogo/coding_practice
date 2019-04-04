package codingbat;

public class Sum28 {
	public static void main(String[] args) {
		int [] array = {2, 3, 2, 2, 4, }; 
		System.out.println(sum28(array));
	}

	public static boolean sum28(int[] array) {
		Integer [] x = {new Integer(1)};
		int count = 0;
		for (int i = 0; i < array.length && count < 5; i++) {
			if (array[i] == 2) {
				count++;
			}
		}
		if (count == 4)
			return true;
		
		return false;
	}

}
