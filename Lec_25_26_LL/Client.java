package Lec_25_26_LL;

import Lec_25_26_LL.LinkedList.Node;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.disp();
		LL.addFirst(5);
		LL.disp();
		LL.addLast(50);
		LL.disp();
		System.out.println(LL.removeAt(0));
		LL.disp();
		System.out.println(LL.removeAt(2));

		System.out.println("===========");
		LL.disp();
		
		LL.rev2();
		LL.disp();
		System.out.println(LL.mid());
		System.out.println("===========");
		LL.disp();
//		System.out.println(LL.LastK(1));
//		System.out.println(LL.LastK(2));
//		System.out.println(LL.LastK(3));
		System.out.println("===========");
		LL.rev2();
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		LL.addAt(2, 30);
		LL.disp();
		LL.K_Rev(3);
		LL.disp();
		System.out.println("===========");
		LL.addLast(100);
		LL.addLast(110);
		LL.K_Rev(3);
		LL.disp();
		
		System.out.println("===========");
		System.out.println("===========");
		System.out.println("===========");

		LL = new LinkedList(true);
		System.out.println(LL.hasCycle());
//		System.out.println(LL.CycleLen());
		LL.CycleRem();
		System.out.println(LL.hasCycle());
		LL.disp();
	}
}
