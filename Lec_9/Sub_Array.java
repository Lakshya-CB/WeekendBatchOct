package Lec_9;

public class Sub_Array {
	public static void main(String[] args) {

		int[] arr = { 10, -20, 30, -25, 40, 50, -10 };

		int jeb = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				disp(arr, i, j);
				sum = sum + arr[j];
//				int aam = sum(arr, i, j);
//				if (aam > jeb) {
//					jeb = aam;
//				}
				jeb = Math.max(jeb, sum);

				System.out.println("Sum :  " + sum(arr, i, j));
				System.out.println("==");
			}
			System.out.println("========================");
		}
		System.out.println(jeb);
	}

	public static void disp(int[] arr, int i, int j) {
		while (i <= j) {
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();

	}

	public static int sum(int[] arr, int i, int j) {
		int sum = 0;
		while (i <= j) {
//			System.out.print(arr[i]+" ");
			sum = sum + arr[i];
			i++;
		}
		return sum;
	}
}
