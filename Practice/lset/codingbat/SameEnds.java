package codingbat;

public class SameEnds {

	public static void main(String[] args) {

		int [] array = {5, 6, 45, 99, 13, 5, 6};
		System.out.println(sameEnds(array, 1));
	}

	public static boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - len + i])
				return false;
		}
		return true;
	}
}