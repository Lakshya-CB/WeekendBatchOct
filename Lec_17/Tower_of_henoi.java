package Lec_17;

import java.util.ArrayList;

public class Tower_of_henoi {
	static ArrayList<Integer> A = new ArrayList<>();
	static ArrayList<Integer> B = new ArrayList<>();
	static ArrayList<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
//		TOH(4, 'A', 'C', 'B');
		A = new ArrayList<>();
		B = new ArrayList<>();
		C = new ArrayList<>();

		A.add(4);
		A.add(3);
		A.add(2);
		A.add(1);
//		System.out.println(A);
		TOH_AL(4, A, C, B);
	}

	public static void TOH(int n, char src, char dest, char elp) {

		if (n == 0) {
			return;
		}
		TOH(n - 1, src, elp, dest);
//		Self karo!!, src = 1 disk , elper par n-1 disks and dest!!
		System.out.println("Move " + n + "th disk from " + src + " to " + dest + " using " + elp);
//		Self karo!!, src = 0 disk , elper par n-1 disks and dest= 1 disk nth disk!!
		TOH(n - 1, elp, dest, src);

	}

	public static void TOH_AL(int n, ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> elp) {

		if (n == 0) {
			return;
		}
		TOH_AL(n - 1, src, elp, dest);
//		Self karo!!, src = 1 disk , elper par n-1 disks and dest!!
//		System.out.println("Move " + n + "th disk from " + src + " to " + dest + " using " + elp);

		int disk = src.remove(src.size() - 1);
		dest.add(disk);
		System.out.println(A + " == " + B + " == " + C);
		// Self karo!!, src = 0 disk , elper par n-1 disks and dest= 1 disk nth disk!!
		TOH_AL(n - 1, elp, dest, src);

	}
}
