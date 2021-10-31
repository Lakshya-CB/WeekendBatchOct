package Lec_4;

import java.util.Scanner;

public class Pat_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
			if (row >= n + 1) {
				nst--;
			} else {
				nst++;
			}
		}
	}
}
