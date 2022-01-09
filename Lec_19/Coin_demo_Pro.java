package Lec_19;

import java.util.Arrays;

public class Coin_demo_Pro {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 2, 3, 4, 2, 3 };
//		type_1("", 0, 0, 4, coins);
//		type_2("", 0, 0, 6, coins);
		Arrays.sort(coins);
		type_3("", 0, 0, 6, coins);
	}

	public static void type_1(String ans, int last_idx, int curr_sum, int given_sum, int[] coins) {
//		Coins unique, Infinite coins, Combination or Permutaion!!
		if (curr_sum > given_sum) {
			return;
		}
		if (curr_sum == given_sum) {
			System.out.println(ans);
			return;
		}

		for (int i = last_idx; i < coins.length; i++) {
			type_1(ans + "," + coins[i], i, curr_sum + coins[i], given_sum, coins);
		}
	}

	public static void type_2(String ans, int last_idx, int curr_sum, int given_sum, int[] coins) {
//		Coins unique, finite coins, Combination
		if (curr_sum > given_sum) {
			return;
		}
		if (curr_sum == given_sum) {
			System.out.println(ans);
			return;
		}

		for (int i = last_idx; i < coins.length; i++) {
			type_2(ans + "," + coins[i], i + 1, curr_sum + coins[i], given_sum, coins);
		}
	}

	public static void type_3(String ans, int last_idx, int curr_sum, int given_sum, int[] coins) {
//		Coins duplicates, finite coins, Combination
		if (curr_sum > given_sum) {
			return;
		}
		if (curr_sum == given_sum) {
			System.out.println(ans);
			return;
		}

		for (int i = last_idx; i < coins.length; i++) {
			if (i == last_idx || coins[i] != coins[i - 1]) {

				type_3(ans + "," + coins[i], i + 1, curr_sum + coins[i], given_sum, coins);
			}
		}
	}
}
