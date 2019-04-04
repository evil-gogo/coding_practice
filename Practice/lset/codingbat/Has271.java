package codingbat;

public class Has271 {
	public static void main(String[] args) {
		//int [] array = {1, 2, 7, 1};
		int [] array = {2, 7, 3 }; 
		System.out.println(has271(array));
	}

	public static boolean has271(int[] array) {	
		for (int i = 0; i < array.length - 2; i++) {
			System.out.println("fsfs");
			if ( (array[i+1] == array[i] + 5) &&   Math.abs(array[i+2] - (array[i])) <= 2) 
				return true;
		}
		return false;
		
	}

}
