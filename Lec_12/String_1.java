package Lec_12;

public class String_1 {
	public static void main(String[] args) {
		String str = "LOL";
		System.out.println(str);
		
		String str_2 = new String("LOL");
		System.out.println(str_2);
		
		
		String str_3 = "LOL";
		
		System.out.println(str==str_2);
		System.out.println(str==str_3);
		
		
		String str_aa = new String("LOL");
		String str_bb = new String("LOL");
		
//		Compare address!! use ==
		System.out.println("==========");
		System.out.println(str_aa==str_bb);
//	Compare Content ??
		System.out.println("==========");
		System.out.println(str_aa.equals(str_bb));
		
	}
}
