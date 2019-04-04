package codingbat;

public class Sum67 {
	public static void main(String[] args) {
		int [] array = {1, 2, 2, 6, 99, 99, 7};
		System.out.println(sum67(array));
	}

	public static int sum67(int[] nums) {
		int sum=0; boolean flag = false;
		for(int i = 0; i< nums.length; i++) {
			if (nums[i] == 6) {
				flag = true;
			} 
			if (!flag) {
				sum += nums[i];
			}
			if (flag && nums[i] == 7) {
				flag = false;
			}
			
		}
		return sum;
	}
}
