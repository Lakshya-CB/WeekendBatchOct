package Lec_5;

public class Pat_27 {
	public static void main(String[] args) {
		int n = 5;

		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		
		
		
		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int ntp =1; 
			
			int cst = 1;
			
			while (cst <= nst) {
				System.out.print(ntp+"\t");
				cst++;
				if(cst>nst/2+1) {
					ntp--;
				}
				else {
					ntp++;
				}
			}
			row++;
			System.out.println();
			nst = nst + 2;
			nsp = nsp - 1;
			
//			ntp++; //pat 24
		}
	}
}
