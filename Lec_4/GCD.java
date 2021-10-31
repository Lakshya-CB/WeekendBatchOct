package Lec_4;

public class GCD {
	public static void main(String[] args) {
		int divisor = 18;
		int dividend = 30;
		while(divisor>0) {
			System.out.println(dividend+"/"+divisor);
			int rem = dividend%divisor;
//		OPtion a	
			dividend = divisor;
			divisor = rem;
//		Option b = wrong
//			divisor = rem;
//			dividend = divisor;
		}
		System.out.println(dividend);
	}
}
