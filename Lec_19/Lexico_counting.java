package Lec_19;

public class Lexico_counting {
	public static void main(String[] args) {
//		for (int s = 1; s <= 9; s++) {
//			Lec_C(s, 1000);
//		}
		Lec_C(0, 1000);
		
	}

	public static void Lec_C(int num, int limit) {
//		-ve BC
		if (num > limit) {
			return;
		}

		System.out.println(num); // +ve BC is in every function frame!!

//		Recursive calls
		int i = 0;
		if(num==0) {
			i=1;
		}
		for (; i <= 9; i++) {
			Lec_C(num * 10 + i, limit);
		}
	}
}
