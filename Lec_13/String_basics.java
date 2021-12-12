package Lec_13;

public class String_basics {
	public static void main(String[] args) {
		String str = "the sky is blue";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.substring(0,3));
		
//		Index of!!
		int idx = str.indexOf(' ');
		System.out.println(idx);
		System.out.println(str.indexOf("lu"));
		System.out.println(str.indexOf("LOL"));
		
		
	}
}
