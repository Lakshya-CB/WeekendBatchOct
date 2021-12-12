package Lec_12;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		int n = 27;
		boolean[] isprime = new boolean[n + 1];
		Arrays.fill(isprime, true);

		for (int fact = 2; fact * fact <= n; fact++) {
//			fact ka table!!
			if (isprime[fact]) {
				for (int mult = 2; fact * mult <= n; mult++) {
					isprime[mult * fact] = false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isprime[i]) {
				System.out.println(i);
			}
		}
	}
}
