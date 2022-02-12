package Lec_29;

public class unique_k {
	public static void main(String[] args) {
		String str = "aaabbcdecdeefffffffffffffffffffffffffffffff";
		int k = 3;
		solve(str, k);

	}

	public static void solve(String str, int k) {
		int[] batua = new int[26];
		int s = 0;
		int e = 0;
		int score = 0;
		while (true) {
			System.out.println(str.substring(s,e)+" == "+score);
			if (score <= k) {
//				add the chat at index e!!
				char ch = str.charAt(e);
				if(batua[ch-'a']==0) {
					score++;
				}
				batua[ch-'a']=batua[ch-'a']+1;
				e++;
			}else if(score>k) {
//				delete char at s;
				char ch = str.charAt(s);
				if(batua[ch-'a']==1) {
					score--;
				}
				batua[ch-'a']=batua[ch-'a']-1;
				s++;
			}
			
//			if()
		}
	}
}
