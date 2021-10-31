package Lec_4;

public class prime_factors {
	public static void main(String[] args) {
		int n = 36;
		int fact = 2;
		while(n>1) {
			if(n%fact==0) {
				System.out.println(fact);
				n=n/fact;
			}
			else {
				fact=fact+1;
			}
		}
		
	}
}
