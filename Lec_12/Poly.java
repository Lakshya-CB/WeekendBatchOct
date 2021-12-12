package Lec_12;

public class Poly {
	public static void main(String[] args) {
		int x = 2;

		int n = 3;
		int pow = x;

		int ans = 0;
		for (int c = n; c >= 1; c--) {
			ans = ans + pow * c;
//			System.out.println(pow*c);
			pow = pow * x;
		}
		System.out.println(ans);
	}
}
