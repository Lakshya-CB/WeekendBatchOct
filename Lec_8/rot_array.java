package Lec_8;

public class rot_array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int r = 5;
		
//		r is periodic , with period of arr.len
		r = r%arr.length;
		for (int rot = 1; rot <= r; rot++) {

			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
			disp(arr);
		}
		System.out.println("===========");
		disp(arr);
	}

	public static void disp(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
}
