package Lec_HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_G {
	
	class Pair{
		String K;
		int val;
		public Pair(String k, int v) {
			// TODO Auto-generated constructor stub
			K=k;
			val = v;
		}
		
	}
	ArrayList<LinkedList<Pair>> AL ;
	public HashMap_G() {
		// TODO Auto-generated constructor stub
		AL= new ArrayList<>();
		for(int i=0;i<4;i++) {
			AL.add(null);
		}
	}
	public void put(String K, int Val) {
		int buck_num = hash(K);
		
		LinkedList LL = AL.get(buck_num);
		
		Pair nn = new Pair(K,Val);
		LL.re
//		if it doesnt exist in the linked List
		if(LL.contains(LL))
		nn.next = 
		
	}
}
