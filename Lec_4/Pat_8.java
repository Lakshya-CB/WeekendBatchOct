package Lec_4;

public class Pat_8 {
	public static void main(String[] args) {
		int n = 4;

		int nst = n;
		int row = 1;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				if (row == cst||row+cst==n+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cst++;
			}

			row++;
			System.out.println();
		}
	}
}
