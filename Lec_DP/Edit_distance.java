package Lec_DP;

public class Edit_distance {
	public int minDistance(String word1, String word2) {
		if (word1.length() == 0) {
			return word2.length();
		}
		if (word2.length() == 0) {
			return word1.length();
		}
		if (word1.charAt(0) == word2.charAt(0)) {
			return minDistance(word1.substring(1), word2.substring(1));
		} else {
//			Insert
			int I = minDistance(word1, word2.substring(1));

			int R = minDistance(word1.substring(1), word2.substring(1));

			int D = minDistance(word1.substring(1), word2);

			return Math.min(Math.min(R, I), D) + 1;
		}

	}

	public int minDistance(String word1, int idx1, String word2, int idx2) {
		if (word1.length() == idx1) {
			return word2.length() - idx2;
		}
		if (word2.length() == idx2) {
			return word1.length() - idx1;
		}
		if (word1.charAt(idx1) == word2.charAt(idx2)) {
			return minDistance(word1, idx1 + 1, word2, idx2 + 1);
		} else {
//			Insert
			int I = minDistance(word1, idx1, word2, idx2 + 1);

			int R = minDistance(word1, idx1 + 1, word2, idx2 + 1);

			int D = minDistance(word1, idx1 + 1, word2, idx2);

			return Math.min(Math.min(R, I), D) + 1;
		}

	}

	public int minDistance(String word1, int idx1, String word2, int idx2, Integer[][] dp) {
		if (word1.length() == idx1) {
			return word2.length() - idx2;
		}
		if (word2.length() == idx2) {
			return word1.length() - idx1;
		}
		if (dp[idx1][idx2] != null) {
			return dp[idx1][idx2];
		}
		if (word1.charAt(idx1) == word2.charAt(idx2)) {
			dp[idx1][idx2] = minDistance(word1, idx1 + 1, word2, idx2 + 1);
			;
			return dp[idx1][idx2];
		} else {
//			Insert
			int I = minDistance(word1, idx1, word2, idx2 + 1);

			int R = minDistance(word1, idx1 + 1, word2, idx2 + 1);

			int D = minDistance(word1, idx1 + 1, word2, idx2);

			dp[idx1][idx2] = Math.min(Math.min(R, I), D) + 1;
			return dp[idx1][idx2];
		}

	}

	public int minDistanceBU(String word1, String word2) {
		int[][] dp = new int[word1.length() + 1][word2.length() + 1];
		for (int idx1 = word1.length(); idx1 >= 0; idx1--) {

			for (int idx2 = word2.length(); idx2 >= 0; idx2--) {
				if (word1.length() == idx1) {
					dp[idx1][idx2] = word2.length() - idx2;
					continue;
				}
				if (word2.length() == idx2) {
					dp[idx1][idx2] = word1.length() - idx1;
					continue;
				}

//				dp[idx1][idx2]
				if (word1.charAt(idx1) == word2.charAt(idx2)) {
					dp[idx1][idx2] = dp[idx1 + 1][idx2 + 1];
				} else {
//					Insert
					int I = dp[idx1][idx2 + 1];

					int R = dp[idx1 + 1][idx2 + 1];

					int D = dp[idx1 + 1][idx2];

					dp[idx1][idx2] = Math.min(Math.min(R, I), D) + 1;
				}
			}
		}
		return dp[0][0];
	}
}
