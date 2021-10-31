package Lec_3;

import java.util.Scanner;

public class Reverse_num {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 1234;
		int rev  = 0;
		while(n>0) {
			int digit = n%10;
//			System.out.println(digit);
			n = n/10;
			
			rev = rev*10+digit;
		}
		System.out.println(rev);
	}
}
