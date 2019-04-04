package array;

public class LeadersInArray {
	public static void main(String[] args) {
		int[] array = {16, 17, 4, 3, 5, 2};

		System.out.println("Leaders");
		printLeaders(array);
	}

	private static void printLeaders(int[] array) {
		int max_from_right =  array[array.length - 1];

		/* Rightmost element is always leader */
		System.out.print(max_from_right + " ");

		for (int i = array.length - 2; i >= 0; i--) {
			if (max_from_right < array[i]) {           
				max_from_right = array[i];
				System.out.print(max_from_right + " ");
			}
		}    
	}
}
