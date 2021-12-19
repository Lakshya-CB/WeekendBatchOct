package Lec_15;

public class Ruler {
	public static void main(String[] args) {
		Eng_R(5, 3);
	}
	public static void Eng_R(int len, int major) {
		
		for(int i =0;i<len;i++) {
//			System.out.println("Mazak unit");
			for(int ii=0;ii<major;ii++) {
				System.out.print("-");
			}
			System.out.println(i);
			/////
			pat(major-1);
		}
//		Last mazak unit
		for(int ii=0;ii<major;ii++) {
			System.out.print("-");
		}
		System.out.println(len);
		
	}

	public static void pat(int n) {
		if(n==0) {
			return;
		}
		pat(n-1);
		for(int i=0;i<n;i++) {
			System.out.print("-");
		}
		System.out.println();
		pat(n-1);
	}
}
