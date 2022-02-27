package Lec_DP;

public class Climbing {
	public static void main(String[] args) {
		int dst = 4;
		System.out.println(climbStairsTD(0, dst, new int [dst+1]));
	}

	public int climbStairs(int n, int dst) {
		if (n > dst) {
			return 0;
		}
		if (n == dst) {
			return 1;
		}

		int sp1 = climbStairs(n + 1, dst);
		int sp2 = climbStairs(n + 2, dst);

		return sp1 + sp2;
	}

	public static  int climbStairsTD(int n, int dst, int[] dp) {
		if (n > dst) {
			return 0;
		}
		if (n == dst) {
			return 1;
		}
		if(dp[n]!=0) {
			return dp[n];
		}

		int sp1 = climbStairsTD(n + 1, dst, dp);
		int sp2 = climbStairsTD(n + 2, dst, dp);

		dp[n] = sp1 + sp2;

		return sp1 + sp2;
	}
	public static int climbStairsBU(int dst) {
		int[] dp = new int[dst+2];
		
		dp[dst] = 1;
		dp[dst+1] = 0;
		for(int n = dst-1;n>=0;n--) {
//			create the dp[n]
			int sp1 = dp[n + 1];
			int sp2 = dp[n + 2];

			dp[n] = sp1 + sp2;	

		}
		return dp[0];
		
	}
}
