package Lec_DP;

public class Fibo {
	public static void main(String[] args) {
		int I = 50000;
		System.out.println(FibTD(I, new int[I + 1]));
	}

	public static int Fib(int n) {
		if (n <= 1) {
			return n;
		}
		int a1 = Fib(n - 1);
		int a2 = Fib(n - 2);

		return a1 + a2;
	}

	public static int FibTD(int n, int[] dp) {
		if (n <= 1) {
			return n;
		}
//		USe that DP array!!
		if (dp[n] != 0) {
			return dp[n];
		}
		int a1 = FibTD(n - 1, dp);
		int a2 = FibTD(n - 2, dp);

		dp[n] = a1 + a2; // memorization!!
		return dp[n];
	}

	public static int FibBU(int I) {
		int[] dp = new int[I + 1];
//		BASE CASE:!!! Initialize hote hein!!!!!
		dp[0]=0;
		dp[1]= 1;
		for (int n = 2; n <= I; n++) {
//			creating dp[n]
//			Fib(n)!!
			int a1 = dp[n - 1];
			int a2 = dp[n - 2];

			dp[n] = a1 + a2;
			
		}
		return dp[I];
	}
}
