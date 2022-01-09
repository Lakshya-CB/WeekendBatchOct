package Lec_20;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int arr[] = { 50, 40, 30, 90,20, 10,100 };
		quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int arr[], int s, int e) {
		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		int pivot = arr[mid];

//		Place pivot at its correct position such that, a
//		all smaller numbers are on the left side and
//		all bigger numbers are on the right side!!

		int left = s;
		int right = e;
		while (right > left) {
//			left problem!!!
			while (arr[left] < pivot) {
				left++;
			}
//			right problem!!!
			while (arr[right] > pivot) {
				right--;
			}

//			swap!!
			if (right >= left) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}

		}
		quick(arr, s, right);
		quick(arr, left, e);

	}
}
