package Lec_8;

public class swap_1 {
	public static void main(String[] args) {
//		int[] arr1 = new int[1000000000];
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
//		swap doesnt occur
//		int t = a1[0]; 
//		swap(t,100);
		
//		disp(a1);
//		disp(a2);
//		swap_in(a1, a2, 3);
		int[] a3= swap_arr(a1, a2);
		disp(a1);
		disp(a2);
		
	}
	public static int[] swap_arr(int[] a, int[] b) {
		int[] d = a;
		a = b;
		b = d;
		return a;
	}
	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
	}
	public static void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
	}
	public static void disp(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}
