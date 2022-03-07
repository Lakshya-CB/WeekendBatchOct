package Lec_DP;

import java.util.Scanner;

public class Coin_change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();
		int[] coins = new int[scn.nextInt()];
		for (int u = 0; u < coins.length; u++) {
			coins[u] = scn.nextInt();
		}
//		System.out.println(coin(A, 0, coins));
//		System.out.println(coinTD(A, 0, coins, new Integer[A + 1][coins.length]));
		System.out.println(BU(A, coins));
	}

	public static int coin(int A, int idx, int[] coins) {
//		+ve BC
		if (A == 0) {
			return 1;
		}

		// -ve BC
		if (A < 0 || idx == coins.length) {
			return 0;
		}

		int sp1 = coin(A - coins[idx], idx, coins);
		int sp2 = coin(A, idx + 1, coins);

		return sp1 + sp2;
	}

	public static int coinTD(int A, int idx, int[] coins, Integer[][] dp) {
//		+ve BC
		if (A == 0) {
			return 1;
		}

		// -ve BC
		if (A < 0 || idx == coins.length) {
			return 0;
		}
//	
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}

		int sp1 = coinTD(A - coins[idx], idx, coins, dp);
		int sp2 = coinTD(A, idx + 1, coins, dp);

		dp[A][idx] = sp1 + sp2; // memorization!!

		return sp1 + sp2;
	}

	public static int BU(int Amount, int[] coins) {
		int dp[][] = new int[Amount + 1][coins.length + 1];

		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				create the solution of dp[A][idx]
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}

				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];

				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[Amount][0];
	}
	public static int BUSE(int Amount, int[] coins) {
//		int dp[][] = new int[Amount + 1][coins.length + 1];
		int dp_c[] = new int[Amount + 1];
		int dp_p[] = new int[Amount + 1];

		for (int idx = coins.length - 1; idx >= 0; idx--) {
			dp_c = new int[Amount + 1];
			for (int A = 0; A <= Amount; A++) {
//				create the solution of dp[A][idx]
				if (A == 0) {
					dp_c[A] = 1;
					continue;
				}

				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp_c[A - coins[idx]];
				}
				int sp2 = dp_p[A];

				dp_c[A] = sp1 + sp2;
			}
			dp_p = dp_c;
		}
		return dp_c[Amount];
	}
}
