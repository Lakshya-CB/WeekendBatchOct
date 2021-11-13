package Lec_6;

public class scope_ {
	public static void main(String[] args) {
		int n = 123456;
		int num_digits=0;
		while (n > 0) {

//			System.out.println(lol);
			int lol =0;
			n = n / 10;
			System.out.println(lol);
		}
		System.out.println(num_digits);
		
		
		System.out.println("===================");
		for(;;) {
			
			System.out.println(n);
			break;
		}
		System.out.println("end karo bhai");
	}
}
