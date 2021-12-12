package Lec_13;

public class String_QPS {
	public static void main(String[] args) {
//		word_extr("The Sky is Blue");
		Palin_Ss("aaaa");
	}
	public static void word_extr(String str) {
		
		while(!str.isEmpty()) {
			int idx = str.lastIndexOf(' ');
			String word = str.substring(idx+1);
			System.out.println(word);
			
			if(idx==-1) {
				break;
			}
			str = str.substring(0,idx);
		}
	}
	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length()-1;
		while(e>s) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
	public static void Palin_Ss(String str) {
		for(int axis=0;axis<str.length();axis++) {
			for(int r = 0;r+axis<str.length() && axis-r>=0 ;r++) {
				if(str.charAt(axis+r)==str.charAt(axis-r)) {
//					Current substring from axis-r to axis+r is a Palin
					System.out.println(str.substring(axis-r,axis+r+1));
				}
				else {
					break;
				}
			}
		}
//	for even
		for(double axis=0.5;axis<str.length();axis++) {
			for(double r = 0.5;r+axis<str.length() && axis-r>=0 ;r++) {
				if(str.charAt((int)(axis+r))==str.charAt((int)(axis-r))) {
//					Current substring from axis-r to axis+r is a Palin
					System.out.println(str.substring((int)(axis-r),(int)(axis+r+1)));
				}
				else {
					break;
				}
			}
		}
	}
}
