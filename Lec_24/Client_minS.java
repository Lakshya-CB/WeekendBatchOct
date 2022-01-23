package Lec_24;

import Lec_22.Stack;

public class Client_minS {
	public static void main(String[] args) throws Exception {
		Stack S = new minStack();
		S.push(10);
		S.push(50);
		S.push(40);
		S.push(6);
		S.push(45);
		S.push(2);
		S.push(1);
		S.disp();
//		System.out.println(((minStack)S).min());
		System.out.println(S.pop());
		System.out.println(((minStack)S).min());
//		S.disp();
		System.out.println(S.pop());
		System.out.println(((minStack)S).min());
		
	}
}
