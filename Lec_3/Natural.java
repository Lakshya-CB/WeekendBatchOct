package Lec_3;

import java.util.Scanner;

public class Natural {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int i= 1;
		while(i<=n) {
//			System.out.println(i);	
			i=i+1;
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
