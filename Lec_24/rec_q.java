package Lec_24;

public class rec_q {
	public static void main(String[] args) {
		partRec("1124", "");
	}

	public static void partRec(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
		}
		for (int i = 1; i <= 2 && i <= str.length(); i++) {
			String chopped = str.substring(0, i);
			int ch = Integer.parseInt(chopped);
			if (ch >= 1 && ch <= 26) {
				char toAdd = (char)(ch+'a'-1);
				String rem = str.substring(i, str.length());
				partRec(rem, ans+ toAdd);
			}
		}
	}
}
