package Lec_30_31;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
//		BST Tree = new BST();
//		Tree.add(10);
//		Tree.add(5);
//		Tree.add(15);
//		Tree.add(20);
//		Tree.add(0);
//		Tree.add(7);
//		Tree.add(6);
//		Tree.disp();
//		System.out.println("==========");
//		
//		Tree.remove(10);
//		Tree.lvl2();
		int[] lvl = {40,20,60,10,30,50,70,-1,-1,25,-1,-1,55,-1,-1,23,-1,52,-1,-1,-1,-1,-1};
		BTree  BT = new BTree(lvl,true);
		BT.lvl2();
		System.out.println(BT.BiggestBST());
		ArrayList<Integer> AL;
		
	}
}
