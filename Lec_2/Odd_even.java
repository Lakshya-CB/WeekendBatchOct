package Lec_2;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		
		int rem = i%2;
		if(rem == 0) {
			System.out.println("Even");
//			 I am google
		}
		else {
			System.out.println("Odd");
		}
	}
}
