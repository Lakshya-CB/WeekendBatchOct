package Lec_15;

import java.util.ArrayList;

public class SUB_sequence {
	public static void main(String[] args) {
//		SubSeq("abc", "");
//		CoinToss(3, "");
//		SubSeqASCII("abc", "");
//		CoinTossHH(5, "", false);
		letterKeyPad("23", "");
	}

	public static void SubSeq(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans + ",");
			return;
		}
		char ch = ques.charAt(0);

		SubSeq(ques.substring(1), ans + ch); // Include!! add ch!!
		SubSeq(ques.substring(1), ans); // Exclude!!

	}

	public static void SubSeqASCII(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans + ",");
			return;
		}
		char ch = ques.charAt(0);

		SubSeqASCII(ques.substring(1), ans + ch); // Include!! add ch!!
		SubSeqASCII(ques.substring(1), ans); // Exclude!!
		SubSeqASCII(ques.substring(1), ans + (int) ch); // Incluce char ch value!!

	}

	public static void CoinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		CoinToss(n - 1, ans + "H");
		CoinToss(n - 1, ans + "T");

	}

	public static void CoinTossHH(int n, String ans, boolean lastH) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (!lastH)
			CoinTossHH(n - 1, ans + "H", true);
		CoinTossHH(n - 1, ans + "T", false);

	}

	public static void letterKeyPad(String ques, String ans) {
		if(ques.isEmpty()) {
			System.out.println(ans);
			return;
		}
			
		char ch = ques.charAt(0);
		String options = getComb(ch);
		for (int i = 0; i < options.length(); i++) {
			char toAdd = options.charAt(i);
			letterKeyPad(ques.substring(1), ans+toAdd);
		}
	}

	public static void letterKeyPad_AL(String ques, String ans,ArrayList<String> AL) {
		if(ques.isEmpty()) {
//			System.out.println(ans);
			AL.add(ans);
			return;
		}
			
		char ch = ques.charAt(0);
		String options = getComb(ch);
		for (int i = 0; i < options.length(); i++) {
			char toAdd = options.charAt(i);
			letterKeyPad_AL(ques.substring(1), ans+toAdd,AL);
		}
	}
	public static String getComb(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {

			return "def";
		} else if (ch == '4') {

			return "ghi";
		} else if (ch == '5') {

			return "jkl";
		} else if (ch == '6') {

			return "mno";
		} else if (ch == '7') {

			return "pqrs";
		} else if (ch == '8') {

			return "tuv";
		} else if (ch == '9') {

			return "wxyz";
		}
		return "";
	}

}
