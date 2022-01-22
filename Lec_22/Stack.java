package Lec_22;

public class Stack {
	protected int[] arr = new int[5];
	protected int tos;

	public Stack() {
		
		tos = -1;
	}

	public Stack(int cp) {
		arr = new int[cp];
		tos = -1;
	}

	public void push(int ali) throws Exception {
		if (isFull()) {
			throw new Exception("Bhai kaha add kar rha hein!?! Stack full hein ");
		}
		tos++;
		arr[tos] = ali;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bhai kya deekh rha hien?! Stack Empty!");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bhai kya deekh rha hien?! Stack Empty!");
		}
		return arr[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void disp() {
		int temp = tos;
		while (temp >= 0) {
			System.out.print(arr[temp] + " ");
			temp--;
		}
		System.out.println();
	}
}
