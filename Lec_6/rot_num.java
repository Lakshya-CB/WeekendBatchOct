package Lec_6;

public class rot_num {
	public static void main(String[] args) {
		int n = 123456;
		int r = 3;
		
		
		int copy = n;
		int num_digits = 0;
		while (n > 0) {
			n = n / 10;
			num_digits++;
		}
		
//		restore value of n 
		n = copy;
//		Use % num_digit for rotation
		r = r%num_digits;
		for (int rr = 1; rr <= r; rr++) {
			int part1 = n / 10;
			int part2 = n % 10;
			int pow = (int) Math.pow(10, num_digits-1);
			int rot_num = part1 + part2 * pow;

			System.out.println(rot_num);
			n = rot_num;
		}
	}
}
