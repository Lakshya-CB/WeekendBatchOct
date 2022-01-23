package Lec_24;

import Lec_22.Stack;
import Lec_23.Dynamic_Stack;

public class Client_Stack_QPS {
	public static void main(String[] args) throws Exception {
//		Stack S = new Dynamic_Stack();
//		S.push(10);
//		S.push(20);
//		S.push(30);
//		S.push(40);
//		S.push(50);
//
////		S.disp();
////		RevPrint(S);
////		Rev(S, new Dynamic_Stack());
//		S.disp();
//		Rev2(S);
//		S.disp();
	
	int[][]mat= {{0 ,   1  ,  1 ,   1},
				{1  ,  0  ,  0  ,  0},
				{0  ,  0  ,  0  ,  0},
				{1  ,  1  ,  1  ,  0}};
	Celeb(mat);
	}

	public static void RevPrint(Stack S) throws Exception {
		if (S.isEmpty()) {
			return;
		}
		int data = S.pop();
		RevPrint(S);
		System.out.println(data);
		S.push(data);
	}

	public static void Rev(Stack S, Stack helper) throws Exception {
		if (S.isEmpty()) {
			return;
		}
		int data = S.pop();
		Rev(S, helper);
		while (!S.isEmpty()) {
			int temp = S.pop();
			helper.push(temp);
		}
		S.push(data);
		while (!helper.isEmpty()) {
			int temp = helper.pop();
			S.push(temp);
		}
	}

	public static void Rev2(Stack S) throws Exception {
		Stack H = new Dynamic_Stack();
//		Reverse stack in H
		while (!S.isEmpty()) {
			H.push(S.pop());
		}
//		Just copy!!!
		Copy_S(H, S);
	}

	public static void Copy_S(Stack S, Stack Copy) throws Exception {
		if (S.isEmpty()) {
			return;
		}
		int data = S.pop();
		Copy_S(S, Copy);
//		System.out.println(data);
		S.push(data);
		Copy.push(data);
	}

	public static void Celeb(int[][] mat) throws Exception {
		Stack s = new Dynamic_Stack();
		for (int i = 0; i < mat.length; i++) {
			s.push(i);
		}
		while (s.size() != 1) {
			int a = s.pop();
			int b = s.pop();
			if (mat[a][b] == 0) {
				s.push(a);
			} else {
				s.push(b);
			}
		}
		int Celeb = s.pop();
		for(int col =0;col<mat.length;col++) {
			if(mat[Celeb][col]==1) {
				System.out.println("No celeb");
				return;
			}
		}
		for(int row =0;row<mat.length;row++) {
			if(mat[row][Celeb]==0 && row!=Celeb) {
				System.out.println("No celeb");
				return;
			}
		}
		System.out.println(Celeb+ " vo aagya !" );
	}
	
}
