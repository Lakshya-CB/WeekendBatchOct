package Lec_4;

public class PAt_15 {
	public static void main(String[] args) {
		int n = 5;

		int row = 1;
		int nsp = 0;
		int nst = n;
		while (row <= 2 * n - 1) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;

			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
			if (row >= n + 1) {
				nst = nst + 1;
				nsp = nsp - 2;

			} else {
				nst = nst - 1;
				nsp = nsp + 2;
			}
		}
	}
}
