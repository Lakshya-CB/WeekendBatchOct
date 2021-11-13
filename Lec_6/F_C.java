package Lec_6;

public class F_C {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;
		for (int F = min_F; F <= max_F; F = F + step) {
			double C = ((F - 32) * (5 / 9.0));
			System.out.println(F + "\t" + String.format("%.0f", C));
		}
	}
	
}
