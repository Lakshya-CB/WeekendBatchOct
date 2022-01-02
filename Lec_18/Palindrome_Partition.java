package Lec_18;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partition {
	public static void main(String[] args) {
		List<List<String>>All_ans = new ArrayList<List<String>>();
		Partition("nitin", "", new ArrayList<>(), All_ans);
		System.out.println(All_ans);
	}

	public static void Partition(String bacha, String pieces, List<String> AL, List<List<String>> All_ans) {
		if (bacha.isEmpty()) {
//			System.out.println(pieces);
//			System.out.println(AL);
			All_ans.add(new ArrayList<>(AL)); // create a copy!!
			return;
		}
		for (int chaku = 1; chaku <= bacha.length(); chaku++) {
			String piece = bacha.substring(0, chaku);
			if (isPlain(piece)) {
				String bacha_sp = bacha.substring(chaku);
				AL.add(piece); // prep
				Partition(bacha_sp, pieces + piece + "==", AL, All_ans);
				AL.remove(AL.size() - 1); // explicit back tracking!!
			}
		}
	}

	public static boolean isPlain(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
