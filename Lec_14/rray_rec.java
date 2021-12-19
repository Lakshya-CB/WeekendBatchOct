package Lec_14;

public class rray_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 99, 9, 99, 30, 99 };
//		print(0, arr);
//		print_rev(0, arr);
//		System.out.println(Max_arr(0, arr));
//		System.out.println(Last_Occ(0, 99, arr));
		System.out.println(All_Occ(0, 0, 99, arr).length);
	}

	public static void print(int idx, int[] arr) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		print(idx + 1, arr);
	}

	public static void print_rev(int idx, int[] arr) {
		if (idx == arr.length) {
			return;
		}
		print_rev(idx + 1, arr);
		System.out.println(arr[idx]);
	}

	public static int Max_arr(int idx, int[] arr) {

		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int sp = Max_arr(idx + 1, arr);
		return Math.max(arr[idx], sp);
	}

	public static int First_Occ(int idx, int ali, int[] arr) {
		if (idx == arr.length) {
			return -1;
		}
		int sp = First_Occ(idx + 1, ali, arr);
		if (arr[idx] == ali) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int Last_Occ(int idx, int ali, int[] arr) {
		if (idx == arr.length) {
			return -1;
		}
		int sp = Last_Occ(idx + 1, ali, arr);
		if (arr[idx] == ali && sp == -1) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int[] All_Occ(int idx, int count, int ali, int[] arr) {
		if(idx==arr.length) {
			return new int[count];
		}
		if (arr[idx] == ali) {
			int[] ans = All_Occ(idx + 1, count + 1, ali, arr);
			arr[count] = idx;
			return ans;
		} else {
			int[] ans = All_Occ(idx + 1, count, ali, arr);
			
			return ans;
		}
	}
}
