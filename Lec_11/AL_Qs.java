package Lec_11;

import java.util.ArrayList;

public class AL_Qs {
	public static void main(String[] args) {

//		int[] arr1 = { 10, 10, 20, 30, 35, 35, 40, 50, 60, 120, 130 };
//		int[] arr2 = { 20, 32, 35, 35, 35, 50, 55, 64, 70 };
//		System.out.println(inter(arr1, arr2));
		int[] arr2 = { 9, 9, 8, 7 };
		int[] arr1 = { 6, 5 };
		System.out.println(add(arr1, arr2));
	}

	public static ArrayList<Integer> inter(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {

			if (arr1[idx1] == arr2[idx2]) {
				ans.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] > arr2[idx2]) {
				idx2++;
			} else {
				idx1++;
			}
		}
		return ans;
	}

	public static ArrayList<Integer> add(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if(idx1>=0)
				sum = sum + arr1[idx1];
			if(idx2>=0)
				sum = sum + arr2[idx2];
			
			
			int digit = sum % 10;
			carry = sum / 10;

			ans.add(0, digit);
			idx1--;
			idx2--;
		}
		if(carry>0) {
			ans.add(0, 1);
		}
		return ans;
	}
}
