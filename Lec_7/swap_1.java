package Lec_7;

public class swap_1 {
	static int gv = 10;
	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println(gv);
		System.out.println(a + " : " + b);
		a = swap(a, b);
		System.out.println(a + " : " + b);
		System.out.println(gv);
	}

	
	public static int swap(int a, int b) {
		gv++;
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
		return a;
	}
	
}
