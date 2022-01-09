package Lec_19;

public class Jumping_numbers {
	public static void main(String[] args) {
		int x = 105;
//		System.out.println(0);
		for(int s =1;s<=9;s++) {
			juping(s, x);
		}
	}

	public static void juping(int num, int x) {
		if (num > x) {
			return;
		}
		int digit = num % 10;
		System.out.println(num);
		if (digit - 1 >= 0)
			juping(num * 10 + digit - 1, x);
		if (digit + 1 < 10)
			juping(num * 10 + digit + 1, x);

	}
}
