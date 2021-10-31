package Lec_4;

public class pat_4 {
	public static void main(String[] args) {
		int n = 5;

		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
//			print space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
//			print star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			row++;
			System.out.println();
			nsp--;
			nst++;
		}

	}
}
