package Lec_10;

public class Spiral {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, };
		int min_col = 0;
		int min_row = 0;

		int max_col = mat[0].length - 1;
		int max_row = mat.length - 1;
		int count = 0;
		while (min_row <= max_row && min_col <= max_col) {
			for (int r = min_row; r <= max_row && count < mat.length * mat[0].length; r++) {
				System.out.print(mat[r][min_col] + " ");
				count++;

			}
			System.out.println("\n" + "==========================");
			for (int c = min_col + 1; c <= max_col && count < mat.length * mat[0].length; c++) {
				System.out.print(mat[max_row][c] + " ");
				count++;

			}

			System.out.println("\n" + "==========================");
			for (int r = max_row - 1; r >= min_row && count < mat.length * mat[0].length; r--) {
				System.out.print(mat[r][max_col] + " ");
				count++;

			}

			System.out.println("\n" + "==========================");
			for (int c = max_col - 1; c >= min_col + 1 && count < mat.length * mat[0].length; c--) {
				System.out.print(mat[min_row][c] + " ");
				count++;

			}

			System.out.println("\n" + "==========================");
			System.out.println("END END");
			min_row++;
			max_row--;
			min_col++;
			max_col--;
		}
	}
}
