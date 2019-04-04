package codingbat;

public class CanBalanceDemo {
	public static void main(String[] args) {
		int [] array = {1, 1, 1, 1, 2, 1};
		System.out.println("Returns " + canBalance(array));
	}

	public static boolean canBalance(int[] nums) {
		int leftSum = 0, rightSum = 0;
		for (int i = 0; i < nums.length; i++) {
			leftSum += nums[i];

			rightSum = 0;
			for (int j = nums.length - 1; j > i; j--) {
				rightSum += nums[j];
			}
			if (leftSum == rightSum) {
				return true;
			}
		}
		return false;
	}
}
