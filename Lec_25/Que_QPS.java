package Lec_25;

import java.util.LinkedList;
import java.util.Queue;

public class Que_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
//		Q.poll();
//		System.out.println(Q);
//		RevPrint(Q, 0);
//		System.out.println();
//
//		System.out.println(Q);
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		FristNeg(arr, 3);

	}

	public static void Rev(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.poll();
		Rev(Q);
		System.out.print(temp + " ");
		Q.add(temp);
	}

	public static void RevPrint(Queue<Integer> Q, int count) {
		if (count == Q.size()) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);
		RevPrint(Q, count + 1);
		System.out.print(temp + " ");
	}

	public static void FristNeg(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		Queue<Integer> Disp = new LinkedList<>();
//		

		// create the first window!!
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
			Disp.add(arr[i]);
		}
		System.out.println(Disp + " soln =" + arr[Q.peek()]);
		for (int j = 1; j <= arr.length - k; j++) {
			int end = j + k - 1;
			if (arr[end] < 0) {
				Q.add(end);
			}
			if (!Q.isEmpty()&& Q.peek() == j - 1)
				Q.poll();

			Disp.add(arr[end]);
			Disp.poll();

			System.out.println(Disp + " soln =" + arr[Q.peek()]);
		}
	}
}
