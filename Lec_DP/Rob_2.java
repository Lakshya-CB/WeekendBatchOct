package Lec_DP;

public class Rob_2 {
	public int rob(int[] nums) {
		return robBU(nums);
	}

	public int rob(int idx, int[] nums) {
		// rob!!
		if (idx >= nums.length) {
			return 0;
		}
		int sp1 = rob(idx + 2, nums) + nums[idx];
		int sp2 = rob(idx + 1, nums);
		return Math.max(sp1, sp2);

	}

	public int robTD(int idx, int[] nums, Integer[] dp) {
		// rob!!
		if (idx >= nums.length) {
			return 0;
		}
		if (dp[idx] != null) {
			return dp[idx];
		}
		int sp1 = robTD(idx + 2, nums, dp) + nums[idx];
		int sp2 = robTD(idx + 1, nums, dp);
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);

	}

	public int robBU(int[] nums) {
		int[] dp = new int[nums.length + 2];

		for (int idx = nums.length - 1; idx >= 0; idx--) {
			int sp1 = dp[idx + 2] + nums[idx];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);

		}
		return dp[0];
	}

	public int robBUSE(int[] nums) {
//        int[] dp = new int[nums.length+2];
		int curr = 0;
		int prev = 0;
		int prevprev = 0;

		for (int idx = nums.length - 1; idx >= 0; idx--) {
			int sp1 = prevprev + nums[idx];
			int sp2 = prev;
			curr = Math.max(sp1, sp2);
			prevprev = prev;
			prev = curr;
		}
		return curr;
	}
	public int rob2(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int case1 = robTD2(1,nums,nums.length,new Integer[nums.length]);
        int case2 = robTD2(0,nums,nums.length-1,new Integer[nums.length]);
        return Math.max(case1,case2);
        
    }
    public int robTD2(int idx, int[] nums,int last, Integer[] dp) {
        if(idx>=last){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int sp1 = nums[idx]+robTD2(idx+2,nums,last,dp);
        int sp2 = robTD2(idx+1,nums,last,dp);
        dp[idx]=Math.max(sp1,sp2);
        return Math.max(sp1,sp2);
	}
}
