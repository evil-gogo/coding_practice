package codingbat;

public class HaveThree {
	public static void main(String[] args) {
		int [] array = {1, 3, 1, 3, 1, 3, 4, 3};
		System.out.println(haveThree(array));
	}

	public static boolean haveThree(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 3 && count == 3) 
				return false;

			if (nums[i] == 3) {
				if (i != 0 && nums[i - 1] ==3) {
					return false;
				} else {
					count++;
				}
			}
			if (count==3 && i == nums.length - 1) return true;
		} 
		return false;
	}
}
