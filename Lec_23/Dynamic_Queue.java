package Lec_23;

public class Dynamic_Queue extends Queue {
	@Override
	public void enqueue(int alo) {
		if (isFull()) {
			int[] arr2 = new int[this.arr.length * 2];
			for (int i = start; i < start + size; i++) {
				arr2[i - start] = arr[i % arr.length];
			}
			arr = arr2;
			start = 0;
		}
		super.enqueue(alo);
	}
}
