package Lec_23;

public class Queue {
	int start = 0;
	int size = 0;
	int[] arr = new int[5];

	public Queue() {
		// TODO Auto-generated constructor stub
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		arr = new int[cap];
	}

	public void enqueue(int ali) {
		if (isFull()) {
			throw new RuntimeException("Kuch bhi?! QUeue is full!!");
		}
		int idxE = start + size;
		idxE = idxE % arr.length;
		arr[idxE] = ali;
		size++;
	}

	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein ?!");
		}
		int ans = arr[start];
		return ans;
	}

	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein ?!");
		}
		int ans = arr[start];
		start++;
		start = start % arr.length;
		size--;
		return ans;
	}

	public int size() {
		return this.size;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void disp() {
		int idx = start;
		int count = 0;
		while (count < size) {
			System.out.print(arr[idx] + " ");
			idx++;
			count++;
			idx = idx % arr.length;
		}
		System.out.println();
	}
}
