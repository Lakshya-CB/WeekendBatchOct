package Lec_DP;

public class LIS {
	public static void main(String[] args) {
//		int[] nums = { 0, 1, 0, 3, 2, 3 };
		int[] nums = {10,9,2,5,3,7,101,18};
//		System.out.println(lengthOfLIS(nums, 0, -1001));
		System.out.println(lengthOfLISidx(nums, 0, -1));
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
		if (prev_idx==-1||nums[prev_idx] < nums[idx]) {
			sp1 = lengthOfLISidx(nums, idx + 1, idx) + 1;
		}
		int sp2 = lengthOfLISidx(nums, idx + 1, prev_idx);
		return Math.max(sp1, sp2);
	}
}
