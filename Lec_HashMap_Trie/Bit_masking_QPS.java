package Lec_HashMap_Trie;

public class Bit_masking_QPS {
	public static void main(String[] args) {

	}

	public static int makeBit1(int num, int pos) {
		int mask = 1 << pos;
		int ans = num | mask;
		return ans;
	}

	public static int makeBit0(int num, int pos) {
		int mask = 1 << pos;
		mask = ~mask;
		int ans = num & mask;
		return ans;
	}
	public static int ToggleBit(int num, int pos) {
		int mask = 1 << pos;
		
		int ans = num ^ mask;
		return ans;
	}
}
