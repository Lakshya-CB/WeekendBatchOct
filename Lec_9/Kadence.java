package Lec_9;

public class Kadence {
	public static void main(String[] args) {
		int[] arr = { 10, -20, 30, -25, 40, 50, -10 };
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(sum<0) {
				sum=0;
			}
//			sum = Math.max(sum, 0);
			max = Math.max(max, sum);
			System.out.println(sum+" _ "+arr[i]);
		}
		System.out.println(max);
	}
}
