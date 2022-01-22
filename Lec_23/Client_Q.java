package Lec_23;

import java.util.Arrays;

public class Client_Q {
	public static void main(String[] args) {
		Queue Q = new Queue();
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
		
		System.out.println(Q.dequeue());
		Q.disp();
		
		System.out.println(Q.dequeue());
		Q.disp();
		
		System.out.println(Q.dequeue());
		Q.disp();
		
	}
}
