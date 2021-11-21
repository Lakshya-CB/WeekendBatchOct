package Lec_9;

public class Binary_search {
	public static void main(String[] args) {
		int[] arr = {5,7,11,12,15,20,31,33,35,40,45,55};
		int ali= 37 ;
		System.out.println(BS(arr,ali));
	}
	public static int BS(int[]arr, int ele) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			System.out.println(s+ " + "+ mid+ " + "+e);
			System.out.println(arr[mid]);
			System.out.println("============");
			if(arr[mid]==ele) {
				return mid;
			}
			else if(arr[mid]>ele) {
				e = mid-1;
			}
			else {
				s= mid+1;
			}	
		}
		return -1;
	}
}
