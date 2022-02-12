package Lec_29;

import java.util.Arrays;

public class K_swaps {
	static class pui{
		
	}
	static long max = 0;
	static String max_path = "";
	public static void main(String[] args) {
		long num = 987654321;
		int k = 2;
//		K1(num, k);
		K2(num, k);

	}

	public static void K1(long num, int k) {
		int nod = nod(num);
		int[] arr = new int[nod];
		int idx = 0;
		while (num > 0) {
			int digit = (int) (num % 10);
			arr[idx] = digit;
			num = num / 10;
			idx++;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void K2(long num, int k) {
		String num_n = num + "";

		char[] arr = num_n.toCharArray();
		max = 0;max_path="";
		soln(arr, k,"");
		System.out.println(max);
//		System.out.println(max_path);
		
	}

	public static void soln(char[] num, int k, String path) {
		String ss = new String(num);
		long nn = Long.parseLong(ss);
//		max = Math.max(max, nn);
		if(max<nn) {
			max = nn;
			max_path = path;
		}
		if (k == 0) {
			return;
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
//				swap!!
				swap(num, i, j);
				soln(num, k - 1,path+"{"+i+j+"}");
				swap(num, i, j); // undo!!

			}
		}
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int nod(long num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}
}
