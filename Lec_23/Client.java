package Lec_23;

import Lec_22.Stack;

public class Client {
	public static void main(String[] args) throws Exception {
		Dynamic_Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		S.add(70);
		S.add(80);
		S.add(90);
		S.add(1000);
		S.add(110);
		S.add(120);
		S.disp();
		System.out.println(S.size());
	}
}
