package Lec_23;

import java.util.Arrays;

public class Client_DQ {
	public static void main(String[] args) {
		Queue Q = new Dynamic_Queue();

		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.disp();
		System.out.println(Q.dequeue());
		Q.disp();
		System.out.println(Q.dequeue());
		Q.disp();
		Q.enqueue(50);
		System.out.println(Q.size());
		Q.enqueue(60);
		Q.enqueue(70);
		Q.disp();
		



		System.out.println(Arrays.toString(Q.arr));
		Q.disp();
		System.out.println(Q.isFull());
		Q.enqueue(80);
		System.out.println(Arrays.toString(Q.arr));
		Q.disp();
		
		System.out.println("=========");
		Q.enqueue(90);
		System.out.println(Arrays.toString(Q.arr));
		Q.disp();
		
	}
}
