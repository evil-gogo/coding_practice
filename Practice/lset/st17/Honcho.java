package st17;

public class Honcho {	
	public static void main(String args[]) {

		int y, count = 0;
		for (int x = 0; x < 6; x++) {
			try {
				switch (x) {
				case 3:
					count++;
				case 4:
					count++;
				case 7:
					count++;
				case 9:
				{
					y = 7/ (x-4);
					count += 10;
				}
				}
			} catch (Exception e) {
				count++;
			}
			// TODO: handle exception
		}
		System.out.println(count);
	}
}

