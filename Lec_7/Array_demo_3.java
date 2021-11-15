package Lec_7;

public class Array_demo_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] other = arr;
		
		other[0]=10;
		System.out.println(arr[0]);
		int arr_1[] = {1,2,3,4,5,6};
		System.out.println(arr_1.length);
		System.out.println("============");
		arr_1[3]=30;
		for(int e: arr_1) {
			System.out.println(e);
		}
//		other = new int[5];
//		System.out.println(arr);
//		System.out.println(other);
		
	}
}
