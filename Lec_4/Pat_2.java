package Lec_4;

public class Pat_2 {
	public static void main(String[] args) {
		int n = 5;
		
		int row = 1;
		int nst = 1;
		
		while(row<=n) {
//			Work in each row
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
//			Prep for next row
			row++;
			System.out.println();
			nst++;
		}
	}
}
