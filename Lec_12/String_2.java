package Lec_12;

public class String_2 {
	public static void main(String[] args) {
		String a1 = "lol";
		String a2 = "lol";
		
		
		a2 = "loly";
		
		String a3 = a2;
		
		System.out.println(a1);
		
//		Length ?
		int len = a2.length();
		System.out.println(len);
		
//		Get char at index?
		char ch = a2.charAt(0);

		char ch2 = a2.charAt(a2.length()-1);
		System.out.println(ch2);
		
		System.out.println(a2.substring(0, 3));
		System.out.println("=====================");
		for(int i=0;i<a2.length();i++) {
			for(int j = i+1;j<=a2.length();j++) {
				System.out.println(a2.substring(i,j));
			}
		}
		System.out.println("======");
		System.out.println(a2.substring(0));
		
	}
}
