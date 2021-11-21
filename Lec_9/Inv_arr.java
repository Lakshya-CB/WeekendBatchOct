package Lec_9;

public class Inv_arr {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 3, 0 };

		int[] inv = new int[arr.length];
		for (int idx = 0; idx < arr.length; idx++) {
//			Copy
//			int value_at_idx = arr[idx];
//			inv[idx] = value_at_idx;
//			inv ?
			inv[arr[idx]] = idx;


		}
	}
}
