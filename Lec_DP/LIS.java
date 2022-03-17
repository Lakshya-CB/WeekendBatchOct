package Lec_DP;

public class LIS {
	public static void main(String[] args) {
//		int[] nums = { 0, 1, 0, 3, 2, 3 };
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		System.out.println(lengthOfLIS(nums, 0, -1001));
		System.out.println(lengthOfLISidx(nums, 0, -1, new int[nums.length][nums.length + 1]));

	}

	public static int lengthOfLIS(int[] nums, int idx, int prev_num) {
		if (idx == nums.length) {
			return 0;
		}
//		select karo!!
		int sp1 = 0;
		if (prev_num < nums[idx]) {
			sp1 = lengthOfLIS(nums, idx + 1, nums[idx]) + 1;
		}
		int sp2 = lengthOfLIS(nums, idx + 1, prev_num);
		return Math.max(sp1, sp2);
	}

	public static int lengthOfLISidx(int[] nums, int idx, int prev_idx) {
		if (idx == nums.length) {
			return 0;
		}
//		select karo!!
		int sp1 = 0;
		if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
			sp1 = lengthOfLISidx(nums, idx + 1, idx) + 1;
		}
		int sp2 = lengthOfLISidx(nums, idx + 1, prev_idx);
		return Math.max(sp1, sp2);
	}

	public static int lengthOfLISidx(int[] nums, int idx, int prev_idx, int[][] dp) {
		// dp[idx][prev_idx+1]
		if (idx == nums.length) {
			return 0;
		}
//		select karo!!
		if (dp[idx][prev_idx + 1] != 0) {
			return dp[idx][prev_idx + 1];
		}
		int sp1 = 0;
		if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
			sp1 = lengthOfLISidx(nums, idx + 1, idx, dp) + 1; // dp[idx+1][idx+1]
		}
		int sp2 = lengthOfLISidx(nums, idx + 1, prev_idx, dp); // sp[idx+1][prev_idx+1]

		dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
		return dp[idx][prev_idx + 1];
	}

	public static int lengthOfLIS_BU(int[] nums) {
		int[][] dp = new int[nums.length+1][nums.length + 1];
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			for (int prev_idx = nums.length - 1; prev_idx >= -1; prev_idx--) {
				int sp1 = 0;
				if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
					sp1 = dp[idx + 1][idx + 1] + 1;
				}
				int sp2 = dp[idx + 1][prev_idx + 1];

				dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][-1+1];
	}
}
