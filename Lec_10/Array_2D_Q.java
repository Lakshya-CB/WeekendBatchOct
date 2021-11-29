package Lec_10;

public class Array_2D_Q {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int idx =r;
				if(c%2==1) {
					idx=mat.length-1-r;
				}
				System.out.print(mat[idx][c]+" ");
			}
			System.out.println();
		}
	}
}
