package imsi.inflearn.top50.C1StringArray.T13;

public class MaxSubArray2 {

	public static void main(String[] args) {
		// subarray 중에 합이 제일 큰 수 return
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		// 1
		int newSum = nums[0];
		int max = nums[0];

		// 2
		for (int i = 1; i < nums.length; i++) {
			// Math.max(새로운 값, 기존 꺼 합한 값)
			newSum = Math.max(newSum + nums[i], nums[i]);
			max = Math.max(max, newSum);
		}
		return max;
	}



}


