package Lec_7;

public class Global_varrr {
	static int var = 10;
	public static void main(String[] args) {
		System.out.println(var);
		fun();
		System.out.println(var);
//		Global_varrr.var++;
	}
	public static void fun() {
		int var =0;
		Global_varrr.var++;
	}
	
}
