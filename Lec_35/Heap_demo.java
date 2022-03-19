package Lec_35;

import java.util.PriorityQueue;

public class Heap_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>(); // Integer Rank!!
		PQ.add(10);
		PQ.add(100);
		PQ.add(1);
		PQ.add(3);
		PQ.add(6);
//		
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println("==================");
		Heap H = new Heap();
		H.add(10);
		H.add(100);
		H.add(1);
		H.add(3);
		H.add(6);
		H.Disp();
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		

	}
}
