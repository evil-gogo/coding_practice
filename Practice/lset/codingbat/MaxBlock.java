package codingbat;

public class MaxBlock {
	public static void main(String[] args) {
		System.out.println(maxBlock("xyz"));
	}

	public static int maxBlock(String str) {
		int maxBlock = 0, count = 0;
		if (str.length() == 0) 
			return 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				maxBlock = Math.max(maxBlock, count);
				count = 0;
			}

		} 

		return maxBlock + 1;

	}
}
