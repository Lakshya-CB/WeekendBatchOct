package Lec_10;

import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
//	row x Col
		int[][] mat = new int[2][3];
		System.out.println(mat);
		mat = null;
		System.out.println(mat);

		mat = new int[3][3];

		// Rows
		System.out.println(mat.length);
//		Col 
		System.out.println(mat[0].length);

		System.out.println("===================");
		System.out.println(mat[2][2]);

//		
		System.out.println("===================");
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
//		System.out.println(mat[3]);
		
		System.out.println("===================");
		int count = 1;
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] =count;
				count++;
			}
		}
		System.out.println("===================");
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
		Scanner scn = new Scanner(System.in);
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] =scn.nextInt();
				
			}
		}
		System.out.println("===================");
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}

	}
}
