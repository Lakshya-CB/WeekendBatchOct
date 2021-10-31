package Lec_3;

import java.util.Scanner;

public class Prime_num {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i =1;
		int factor =0;
		while(i<=n) {
//			System.out.println(i);
			if(n%i==0) {
				factor++;
				System.out.println("Factor hein ji "+i);
			}
			i++;
		}
		System.out.println(factor);
		if(factor>2) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("Prime hein ji");
		}
		
	}
}
