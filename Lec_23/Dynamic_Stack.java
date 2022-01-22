package Lec_23;

import Lec_22.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int ali) throws Exception {
		if (this.isFull()) {
			int[] arr2 = new int[this.arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
		}
		super.push(ali);		
	}
	public void add(int ali) throws Exception {
		push(ali);
	}
}
