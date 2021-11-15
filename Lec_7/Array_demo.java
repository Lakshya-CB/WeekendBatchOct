package Lec_7;

public class Array_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr);
//		arr = null;
//		System.out.println(arr);
		System.out.println(arr.length);
		int len = arr.length;
		System.out.println(len);
		
		System.out.println("=================");
		for(int idx=0;idx<arr.length;idx++) {
			System.out.println(arr[idx]);
		}
		

		System.out.println("=================");
		int[] arr_1 = new int[5];
		for(int idx=0;idx<arr.length;idx++) {
			System.out.println(arr_1[idx]);
		}
//		System.out.println(arr[5]);
		
		System.out.println("==================");
		for(int ele : arr) {
			System.out.println(ele);
		}
	}
}
