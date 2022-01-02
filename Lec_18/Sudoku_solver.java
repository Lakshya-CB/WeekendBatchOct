package Lec_18;

import java.util.Scanner;

public class Sudoku_solver {
	public static void main(String[] args) {
		int[][] board = new int[9][9];
		Scanner scn = new Scanner(System.in);
		int waste = scn.nextInt();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = scn.nextInt();
			}
		}
//		System.out.println("_________________");
//		disp(board);
		sudoku(0, 0, board);
	}

	public static void sudoku(int r, int c, int board[][]) {

		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			disp(board);
			return;
		}
		if (board[r][c] == 0) {
			for (int i = 1; i < 10; i++) {
				if (isSafe(board, r, c, i)) {
					board[r][c] = i; // prep!!
					sudoku(r, c + 1, board);
					board[r][c] = 0; // undo!!! 0!!
				}
			}
		} else {
			sudoku(r, c + 1, board);
		}
	}

	public static boolean isSafe(int[][] board, int r, int c, int alo) {
		for (int col = 0; col < 9; col++) {
			if (board[r][col] == alo) {
				return false;
			}
		}

		for (int row = 0; row < 9; row++) {
			if (board[row][c] == alo) {
				return false;
			}
		}
		int boxr = r/3;
		int boxc = c/3;
		for(int row_b = boxr*3;row_b<boxr*3+3;row_b++) {
			for(int col_b = boxc*3;col_b<boxc*3+3;col_b++) {
				if (board[row_b][col_b] == alo) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void disp(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//		System.out.println("==============================");
	}
}
