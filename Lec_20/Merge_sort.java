package Lec_20;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
		int[] arr1 = {10,30,50,80,100};
		int[] arr2 = {1,2,3,4};
		
		int[] arr = {80,70,50,30,10};
//		System.out.println(Arrays.toString(MergeArr(arr1, arr2)));
		System.out.println(Arrays.toString(MergeSort(arr,0,arr.length-1)));

	}

	public static int[] MergeSort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s+e)/2;
		int[]p1 =MergeSort(arr, s, mid);
		int[]p2 =MergeSort(arr,mid+1,e);
		
		return MergeArr(p1, p2);
	}
	public static int[] MergeArr(int arr1[], int arr2[]) {
		int ans[] = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;

		int count = 0;
		while (idx1<arr1.length && idx2<arr2.length) {
			if (arr1[idx1] < arr2[idx2]) {
				ans[count] = arr1[idx1];
				idx1++;
				count++;
			} else {
				ans[count] = arr2[idx2];
				idx2++;
				count++;
			}
		}
		
		while (idx1 < arr1.length ){
			ans[count] = arr1[idx1];
			idx1++;
			count++;
		} 
		while(idx2 < arr2.length) {
			ans[count] = arr2[idx2];
			idx2++;
			count++;
		}

		return ans;
	}
}
