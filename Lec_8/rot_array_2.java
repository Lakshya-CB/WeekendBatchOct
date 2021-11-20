package Lec_8;

public class rot_array_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int r = 2;
		
//		r is periodic , with period of arr.len
		r = r%arr.length;
		
//		part 2 = rotation wala ?
		int p2_end = arr.length-1;
		int p2_start = arr.length-r;
		rev(arr, p2_start, p2_end);
		
		disp(arr);
//		part 1 , remaining part
		int p1_end = p2_start-1;
		int p1_start = 0;
		rev(arr, p1_start, p1_end);
		
		disp(arr);
//		reverse whole array!!
		rev(arr, 0, arr.length-1);
		disp(arr);
		
	}

	public static void rev(int[] arr, int start, int end) {
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
