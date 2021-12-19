package Lec_14;

public class Fact {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = fact(n - 1);
		int soln = sp * n;
		return soln;
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);

		return sp1 + sp2;
	}

}
