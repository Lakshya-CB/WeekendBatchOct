package Lec_13;

public class Rec_1 {
	public static void main(String[] args) {
//		PD(4);
//		PI(4);
		PDI(4);
	}

	public static void PD(int n) {
//		BS?!?! 
		if (n == 0) {
			return;
		}

//		BP : PD(n)
//		SP : PD(n-1)

//		Self Work!
		System.out.println(n);

//		Assume this works!!
		PD(n - 1);

	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		// BP : PI(n)
//		SP: PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n ) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}
}
