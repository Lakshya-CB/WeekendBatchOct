package Lec_6;

public class Inv_num {
	public static void main(String[] args) {
		int n = 23145;
		int pos = 0;
		int inv = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			pos++;
			System.out.println(digit + " " + pos);
			int new_num =(int) (pos * Math.pow(10, digit - 1)); 
			System.out.println(new_num);
			inv = inv + new_num;
		}
		System.out.println(inv);
	}
}
