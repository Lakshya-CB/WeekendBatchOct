package Lec_6;

public class func_demo {
	public static void main(String[] args) {
//		fun2(10, 20, 21, 13, "lol");
//
//		fun1();
		fun1();
		int c = add(10, 20);
		System.out.println(c);
	}

	public static void fun1() {
		System.out.println("Allo ji");
		fun0();
	}
	public static void fun0() {
		System.out.println("saste sashe");
		
	}
	public static void fun2(int a, int b, int c, int d, String str) {
		System.out.println("Allo ji " + a + " __ " + b + str);
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
