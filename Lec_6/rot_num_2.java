package Lec_6;

public class rot_num_2 {
	public static void main(String[] args) {
		int n = 123456;
		int r = 2;

		int copy = n;
		int num_digits = 0;
		while (n > 0) {
			n = n / 10;
			num_digits++;
		}

//			restore value of n 
		n = copy;
//			Use % num_digit for rotation
		r = r % num_digits;

		int pow1 = (int)Math.pow(10, r);
		int part1 = n / pow1;
		int part2 = n % pow1;
		System.out.println(part1+" _ "+part2);
		int pow2 = (int) Math.pow(10, num_digits - r);
		int rot_num = part1 + part2 * pow2;

		System.out.println(rot_num);
	}
}
