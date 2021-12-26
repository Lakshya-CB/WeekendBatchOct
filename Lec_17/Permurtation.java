package Lec_17;

public class Permurtation {
	public static void main(String[] args) {
//perm("abc", "");
//		comb(0, -1, "", 2, 4);
//		comb_wrt_box(0, 2, 0, 4, "");
//		comb_2d(0, 2, 0, 0, 2, 2, "");
		comb_2d_board(0, 2, 0, 0, 3, 3, "", new boolean[3][3]);
	}

	public static void perm(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
		}
		for (int i = 0; i < str.length(); i++) {
			String remain = str.substring(0, i) + str.substring(i + 1);
			perm(remain, ans + str.charAt(i));
		}
	}

	public static void comb(int picked_b, int last_b_idx, String ans, int total_b_to_pick, int total_b) {
		if (picked_b == total_b_to_pick) {
			System.out.println(ans);
			return;
		}
		for (int i = last_b_idx + 1; i < total_b; i++) {
			comb(picked_b + 1, i, ans + "b" + i, total_b_to_pick, total_b);
		}
	}

	public static void comb_wrt_box(int curr_Q, int total_Q, int col, int total_col, String ans) {
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}
		if (col == total_col) {
			return;
		}
		comb_wrt_box(curr_Q + 1, total_Q, col + 1, total_col, ans + "q" + col);
		comb_wrt_box(curr_Q, total_Q, col + 1, total_col, ans);

	}

	public static void comb_2d(int curr_Q, int total_Q, int row, int col, int total_row, int total_col, String ans) {
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}

//		gasp! move to the next row!!
		if (col == total_col) {
			row++;
			col = 0;
		}
		if (row == total_row) {
			return;
		}

		comb_2d(curr_Q + 1, total_Q, row, col + 1, total_row, total_col, ans + "q{" + row + "," + col + "} ");
		comb_2d(curr_Q, total_Q, row, col + 1, total_row, total_col, ans);
	}

	public static void comb_2d_board(int curr_Q, int total_Q, int row, int col, int total_row, int total_col,
			String ans, boolean[][] board) {
		if (curr_Q == total_Q) {
			System.out.println(ans);
//			disp(board);
			return;
		}

//		gasp! move to the next row!!
		if (col == total_col) {
			row++;
			col = 0;
		}
		if (row == total_row) {
			return;
		}
		if (isSafe(board, row, col)) {
			board[row][col] = true;
			comb_2d_board(curr_Q + 1, total_Q, row, col + 1, total_row, total_col, ans + "q{" + row + "," + col + "} ",
					board);
			board[row][col] = false; // Undo the prep!!
		}
		comb_2d_board(curr_Q, total_Q, row, col + 1, total_row, total_col, ans, board);
	}

	public static boolean isSafe(boolean[][] board, int r, int c) {
//		Upar!!
		for (int row = 0; row < r; row++) {
			if (board[row][c]) {
				return false;
			}
		}
//		left!!
		for (int col = 0; col < c; col++) {
			if (board[r][col]) {
				return false;
			}
		}
		
//		uppar left
		int col1 = c;
		int row1 = r;
		while(col1>=0 && row1>=0) {
			if (board[row1][col1]) {
				return false;
			}
			col1--;
			row1--;
			
		}
//		uppar left
		int col2 = c;
		int row2 = r;
		while(col2<board[0].length && row2>=0) {
			if (board[row2][col2]) {
				return false;
			}
			col2++;
			row2--;
			
		}
		return true;
	}

	public static void disp(boolean board[][]) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println("========");
	}
}
