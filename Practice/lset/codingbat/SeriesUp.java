package codingbat;

public class SeriesUp {
	public static void main(String[] args) {
		System.out.println(seriesUp(3));
	}

	public static int[] seriesUp(int n) {
		int array[] = new int [n*(n+1)/2];
		//System.out.println(array.length);
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				//System.out.println(i + " " + j);
				array[index] = j + 1;
				//System.out.println(array[index]);
				index++;
			}

		}
		return array;
	}

}
