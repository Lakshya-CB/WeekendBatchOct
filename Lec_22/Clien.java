package Lec_22;

import java.util.ArrayList;
import java.util.List;

public class Clien {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.isFull());
		s.disp();
		System.out.println(s.pop());
		s.disp();
		s.push(60);
		s.disp();
		s.push(70);
	}
}
