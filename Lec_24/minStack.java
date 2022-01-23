package Lec_24;

import Lec_23.Dynamic_Stack;

public class minStack extends Dynamic_Stack {
	private int min = Integer.MAX_VALUE;

	@Override
	public void push(int ali) throws Exception {

		if (this.isEmpty()) {
			super.push(ali);
			min = ali;
			return;
		}

		if (ali >= min) {
			super.push(ali);
		} else {
			int prev_min = min;
			min = ali;
			int x = 2 * ali - prev_min;
			super.push(x);
		}
	}

	@Override
	public int peek() throws Exception {
		if (super.peek() >= min) {
			return super.peek();
		} else {
			return min;
		}
	}

	@Override
	public int pop() throws Exception {
		if (super.peek() >= min) {
			return super.pop();
		} else {
			int ans = min;
//			Update the varaiable min to prev min!!
			int x = super.pop();

			int prev_min = 2 * min - x;
			
			min = prev_min;
			
			
			return ans;
		}
	}

	public int min() {
// Method 1, simple loop!! T= O(n), S = O(1);
//		Method2, use extra stack, store min at each point, T = O(1), S=O(n)
//		M3 : T=O(1) S=O(1)
		return min;
	}
}
