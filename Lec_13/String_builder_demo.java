package Lec_13;

public class String_builder_demo {
	public static void main(String[] args) {
		String str  = "hula";
//		Convert A given string to StringBuilder!!
		StringBuilder sb = new StringBuilder(str);
		
//		Print
		System.out.println(str);
		System.out.println(sb);
//	Char at !!
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));
//		length ?!
		System.out.println(str.length());
		System.out.println(sb.length());
//		SUbSrting?!
		System.out.println(str.substring(0));
		System.out.println(sb.substring(0));
		
//		Append?!
		sb.append("lololo");
		System.out.println(sb);
		System.out.println();
		
//		set char AT!!
		sb.setCharAt(0, 'O');
		System.out.println(sb);
//		add at index!!
		sb.insert(4, "bhaji");
		System.out.println(sb);
//		remove!!
		sb.deleteCharAt(0);
		System.out.println(sb);
//		remove(inc, exc)
		sb.delete(0, 3);
		System.out.println(sb);
		
		str = sb.toString();
		System.out.println(str);
	}
}
