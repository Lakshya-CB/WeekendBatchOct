package Lec_DP;

public class Min_steps {
	public static void main(String[] args) {
		int n = 99999+10;
		System.out.println(StepsTD(n, new int [n+2]));
		System.out.println(StepsBU(n));
	}

	public static int Steps(int n) {
		if (n == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return Steps(n / 2) + 1;
		} else {
			int sp1 = Steps(n + 1);
			int sp2 = Steps(n - 1);
			return Math.min(sp1, sp2) + 1;
		}
	}

	public static int StepsTD(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}

//		checkar!!
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n % 2 == 0) {
			dp[n] = StepsTD(n / 2,dp) + 1;

		} else {
			int sp1 = StepsTD(n + 1, dp);
			int sp2 = StepsTD(n - 1, dp);
			dp[n] = Math.min(sp1, sp2) + 1;
		}
		return dp[n];
	}
	public static int StepsBU(int num) {
		int[] dp =new int[num+2];
		
		for(int n = 2;n<=num+1;n++) {
//			Solve dp[n]
			
			if (n % 2 == 0) {
				dp[n] = dp[n/2] + 1;

			} else {
				int sp1 = dp[(n + 1)/2]+1;//dp[n + 1];
				int sp2 = dp[n - 1];
				dp[n] = Math.min(sp1, sp2) + 1;
			}
		}
		return dp[num];
		
	}
}
