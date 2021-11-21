package Lec_9;

public class Sorts_1 {
	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
//		bubble(arr);
//		selec(arr);
		int[] arr_1 = { 10, 20, 30, 40, 3 };
		ins(arr);
	}

	public static void bubble(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
//				Swap!!
					swap(arr, i, i + 1);
				}
			}
//			disp(arr);

		}
	}

	public static void selec(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int toplace = arr.length - counter;
			int max_index = toplace;
			for (int i = 0; i <= toplace; i++) {
				if (arr[max_index] < arr[i]) {
					max_index = i;
				}
			}
			swap(arr, max_index, toplace);
			disp(arr);
		}
	}

	public static void ins(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			int jeb = arr[count];
			int idx = count - 1;
//		value chapo
			while (idx >= 0 && arr[idx] > jeb) {
//			aage chapo
				arr[idx + 1] = arr[idx];
				idx--;
				disp(arr);
			}
			arr[idx + 1] = jeb;
			disp(arr);
			System.out.println("====================");
		}
	}

	public static void disp(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
