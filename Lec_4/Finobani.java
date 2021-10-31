package Lec_4;

public class Finobani {
	public static void main(String[] args) {
		int n = 1;
		int a = 0;
		int b = 1;
		while(n<=5) {
			int c = a+b;
			System.out.println(a);
			a=b;
			b=c;
			
			n++;
		}
	}
}
