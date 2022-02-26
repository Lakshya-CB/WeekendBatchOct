package Lec_32;

import java.util.Scanner;

public class Vivek {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int s = scn.nextInt();
			int[] arr = new int[s];
			for(int i=0;i<s;i++) {
				arr[i] = scn.nextInt();
			}
			score = 0;
			int ans = solve(arr, 0,arr.length-1);
			System.out.println(ans);
		}
	}

	static int score = 0;

	static int solve(int[] arr, int idx1,int idx2) {
		for (int p2 = idx1 + 1; p2 < idx2; p2++) {
//		find submission of p1 and p2
//			p1 = o to p2-1;
//			p2 = p2 till end
			long sum1 = sum(arr, idx1, p2 - 1);
			long sum2 = sum(arr, p2, idx2);
			if (sum1 == sum2) {
				
//				System.out.println(idx+" - "+p2+" "+sum1);
//				now u can choose left or right!!
				int a = solve(arr, p2,idx2);
				int b = solve(arr, idx1,p2-1);
				
				return Math.max(a, b)+1;
			}

		}
		return 0;
	}

	public static long sum(int[] arr, int i, int j) {
		long ans = 0;
		for (int ll = i; ll <= j; ll++) {
			ans = ans + arr[ll];
		}
		return ans;
	}
}
