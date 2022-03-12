package Lec_DP;

public class Wine_prob {
	public static void main(String[] args) {
		int cost[] = { 2, 3, 5, 1, 4 };
		System.out.println(maxP(cost, 0, cost.length - 1));
	}

	public static int maxP(int[] cost, int s, int e) {
		if (s > e) {
			return 0;
		}
		int days = cost.length - (e - s + 1) + 1;
		int sp1 = maxP(cost, s + 1, e) + cost[s] * days;
		int sp2 = maxP(cost, s, e - 1) + cost[e] * days;
		return Math.max(sp1, sp2);
	}
}
