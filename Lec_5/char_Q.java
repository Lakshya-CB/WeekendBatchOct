package Lec_5;

import java.util.Scanner;

public class char_Q {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
//		long l = scn.nextLong();
		if(ch>='A'&&ch<='Z') {
			System.out.println("Upper");
		}
		else {
			System.out.println("Lower");
		}
	}
}
