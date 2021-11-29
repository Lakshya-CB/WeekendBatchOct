package Lec_10;

public class Arrays_2D_Search {
	public static void main(String[] args) {
		int[][] mat = { { 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 28, 37, 48 }, 
						{ 29, 33, 39, 50 } };
		int r = 0;
		int c = mat[0].length - 1;
		int ele = 26;
		while(r<mat.length&&c>=0) {
			System.out.println(r+" "+c);
			if(mat[r][c]==ele) {
				System.out.println("Ans: "+r+" "+c);
				return;
			}
			else if(mat[r][c]>ele) {
				c--;
			}
			else {
				r++;
			}
		}
		System.out.println(-1);
		return;
	}
}
