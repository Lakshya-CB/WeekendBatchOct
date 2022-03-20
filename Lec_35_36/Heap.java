package Lec_35_36;

import java.util.ArrayList;

import Lec_29.K_swaps;

public class Heap {
	ArrayList<Integer> AL;

	public Heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public void add(int alo) {
		AL.add(alo);
		Upheapify(AL.size() - 1);
	}

	private void Upheapify(int child) {
		int parent = (child - 1) / 2;
		if (AL.get(child) < AL.get(parent)) {
//			swap!!
			chwap(child, parent);
			Upheapify(parent);
		}

	}

	private void chwap(int i, int j) {
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public int Size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public int peek() {
		return AL.get(0);
	}

	public int poll() {
		int temp = AL.get(0);
		int last = AL.get(AL.size() - 1);
//		change head node!!
		AL.set(0, last);
		AL.remove(AL.size() - 1);
		DownHeapify(0);
		return temp;
	}

	private void DownHeapify(int P) {
		int L = 2 * P + 1;
		int R = 2 * P + 2;

		int min_idx = P;
		if (L < AL.size() && AL.get(L) < AL.get(min_idx)) {
			min_idx = L;
		}
		if (R < AL.size() && AL.get(R) < AL.get(min_idx)) {
			min_idx = R;
		}
		if (P != min_idx) {
			chwap(min_idx, P);
			DownHeapify(min_idx);
		}
	}

	public void Disp() {
		System.out.println(AL);
	}
}
