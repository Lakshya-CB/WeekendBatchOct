package Lec_22;

import java.util.ArrayList;
import java.util.List;

public class Client_PC {
	public static void main(String[] args) {
//		Case 1: 
		P obj1 = new P();

//		Case 2:
//		List<Integer> AL = new ArrayList<>();
		P obj2 = new C();
//		Compiler!! LHS!!
//		JVM RHS!!
		System.out.println(obj2.dataP);
		System.out.println(((C) obj2).dataP);

		System.out.println(((C) obj2).dataC);

		System.out.println("===========");
//		Collision?!!? 

//		Data Members
		System.out.println(((C) obj2).data);
		System.out.println(obj2.data);
//		Resolves on the basis of LHS!! Address!!
		System.out.println("=====================");
//		Functions!!
		((P) obj2).fun1();
		obj2.fun1();

//		Case 3 : 
//		C obj3 = new P(); // !?!

//		Case 4:
		C obj4 = new C();
		Object obb = new Object();
		System.out.println(obj4);
	}
}
