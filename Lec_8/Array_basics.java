package Lec_8;

public class Array_basics {
	public static void main(String[] args) {
		int[] arr = { 11, 12, 4, 5, 10, 17 };
//		System.out.println(Max(arr));
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(find(arr,12));
//		rev(arr);
		rev_2(arr);
		disp(arr);
	}

	public static int Max(int[] arr) {
//		int max = 0;
//		int max = arr[0];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int find(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void rev(int[] arr) {
		int[] arr_1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr_1[i] = arr[arr.length - 1 - i];
		}
		disp(arr_1);
	}

	public static void rev_2(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
//		swap start and end index?!
			int tem = arr[start];
			arr[start] = arr[end];
			arr[end] = tem;
//			update index variables ?
			start++;
			end--;
		}
	}

	public static void disp(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
