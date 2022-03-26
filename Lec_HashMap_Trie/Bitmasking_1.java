package Lec_HashMap_Trie;

public class Bitmasking_1 {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		System.out.println(a | b);

		System.out.println(a & b);

		System.out.println(a ^ b);

		int L = a << 10;//2* // MSB is preserved!!
		int Neg = -20<<5;
		System.out.println(L);
//		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Neg);
//		int R = a >> 3;// div 2 // MSB is preserved!!
		int Neg_R = -20>>3;
//		System.out.println(R);
		System.out.println(Neg_R);
		
        a = -50>>1;
        System.out.println(Integer.toBinaryString(a) + " ---  " +a);
        a = -50>>>1;
        System.out.println(Integer.toBinaryString(a)+ " ---  " +a);
        
		
	}
}
