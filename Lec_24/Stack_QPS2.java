package Lec_24;

import java.util.Stack;

public class Stack_QPS2 {
	public static void main(String[] args) {
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		int[] stonks = { 80, 50, 70, 30, 20, 40, 90, 10, 5, 35 };
//		nextgr8(arr);
		stockspan(stonks);
	}

	public static void nextgr8(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!S.isEmpty() && arr[S.peek()] < arr[i]) {
				int idx = S.pop();
//				System.out.println(arr[idx] + " next gr8er is " + arr[i]);
				ans[idx] = arr[i];
			}
			S.add(i);
		}
		while (!S.isEmpty()) {
			int idx = S.pop();
//			System.out.println(arr[idx] + " next gr8er is " + -1);
			ans[idx] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " next gr8er is " + ans[i]);
		}
	}

	public static void stockspan(int[] stonks) {
		Stack<Integer> S = new Stack<>(); // Stocks jinka span nahi aaya hein
		int[] ans = new int[stonks.length];
		for (int currD = stonks.length - 1; currD >= 0; currD--) {
			while (!S.isEmpty() && stonks[currD] > stonks[S.peek()]) {
				int span = S.peek() - currD;

				System.out.println(S.pop() + " wale day ka span hein " + span);
			}
			S.add(currD);
		}
		while (!S.isEmpty()) {
			int idx = S.pop();
			System.out.println(idx + " wale day ka span hein " + (idx + 1));
		}
	}
}
