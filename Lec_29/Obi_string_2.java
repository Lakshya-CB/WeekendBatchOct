package Lec_29;

import java.util.Scanner;


public class Obi_string_2 {
	static boolean ans = false;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		K_swaps kk = new K_swaps();
//		pui p2 = kk.new pui();
//		pui p = new pui();
//		String in = scn.nextLine();
//		ans = false;
//		if (in.length() > 0 && in.charAt(0)=='a') {
//			create(in, true);
//		}
//		System.out.println(ans);
	}

	public static void create(String in, boolean isbb) {
		if (in.isEmpty()) {
			ans = true;
			return;
		}
		if (in.startsWith("a")) {
			create(in.substring(1), false);
		} else if (!isbb && in.startsWith("bb")) {
			create(in.substring(2), true);
		}
	}
	
}
