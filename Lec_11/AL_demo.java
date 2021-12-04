package Lec_11;

import java.util.*;

public class AL_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
//		Add??!
		AL.add(10);
		AL.add(20);
		AL.add(30);
		
		System.out.println(AL);
		
//		To access at index
		System.out.println(AL.get(0));
		System.out.println(AL.get(1));
		System.out.println(AL.get(2));
//		System.out.println(AL.get(3));
		
		
		System.out.println("===============");
//		Size?!?!!
		int len = AL.size();
		System.out.println(len);
		
		
//		exp1 
		AL.add(40);
		AL.add(50);
		System.out.println(AL.size());

		System.out.println("===============");
//		Change value at index ?!
		AL.set(AL.size()-1, 99);
		System.out.println(AL);
		
//		Add at index!!
		AL.add(0, 900);
		System.out.println(AL);
		AL.add(0, 901);
		System.out.println(AL);
		AL.add(0, 902);
		System.out.println(AL);
		AL.add(AL.size(),100);
		System.out.println(AL);
		
//		for each!!
		for(int ii : AL) {
			System.out.println(ii);
		}
		
		System.out.println("==================");
//		remove!!

		System.out.println(AL);
		int A = AL.remove(0);
		System.out.println(A);
		System.out.println(AL);
	}
}
