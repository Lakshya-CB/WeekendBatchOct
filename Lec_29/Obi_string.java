package Lec_29;

import java.util.Scanner;

public class Obi_string {
	static boolean ans = false;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String in = scn.nextLine();
		// System.out.println(in+"=====");
//		System.out.println(in.startsWith("abbabbbbbbb"));

		if (in.length() == 0 || in.charAt(0) != 'a') {
			System.out.println(false);
		} else {
			create("a", in);
		}
		if(!ans) {
			System.out.println(false);
		}
	}

	public static void create(String curr, String in) {
		if (!in.startsWith(curr)) {
			return;
		}
		if (in.equals(curr)) {
			ans = true;
			System.out.println(true);
			return;
		}
		if (curr.charAt(curr.length() - 1) == 'a') {
//			create(curr, in);
			create(curr + "a", in);
			create(curr + "bb", in);
		} else if (curr.endsWith("bb")) {
//			create(curr, in);
			create(curr + "a", in);
		}
	}
}
