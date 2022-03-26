package Lec_HashMap_Trie;

import java.util.ArrayList;

public class HashMap<KK, VV> {
	class Node {
		public Node(KK k, VV v) {
			// TODO Auto-generated constructor stub
			Key = k;
			Val = v;
		}

		KK Key;
		VV Val;
		Node next;

		public String toString() {
			return "{" + Key + ":" + Val + "}";
		}
	}

	int size = 0;
	ArrayList<Node> buckets;

	public HashMap() {
		// TODO Auto-generated constructor stub
		buckets = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			buckets.add(null);
		}
	}

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		buckets = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			buckets.add(null);
		}
	}

	public int BuckHashFn(KK Key) {
		int aa = Key.hashCode();
		int ans = aa % buckets.size();
		if (ans < 0) {
			ans = ans + buckets.size();
		}
		return ans;
	}

	public void put(KK K, VV V) {
		
		
		int Bucket_num = BuckHashFn(K);
		Node head = buckets.get(Bucket_num);

		Node temp = head;

		while (temp != null) {
			if (temp.Key.equals(K)) {
				temp.Val = V;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node(K, V);
		nn.next = head;
		buckets.set(Bucket_num, nn);
		size++;
		
		
		double load_factor = (size*1.0)/buckets.size();
//		System.out.println(load_factor);
		if(load_factor>2) {
			rehash();
		}
	}

	public VV get(KK K) {
		int Bucket_num = BuckHashFn(K);
		Node head = buckets.get(Bucket_num);
		Node temp = head;
		while (temp != null) {
			if (temp.Key.equals(K)) {

				return temp.Val;
			}
			temp = temp.next;
		}
		return null;
	}

	public void remove(KK K) {
		int Bucket_num = BuckHashFn(K);
		Node head = buckets.get(Bucket_num);

		if (head.Key.equals(K)) {
//			delete Head node
			head = head.next;
			buckets.set(Bucket_num, head);
			return;
		}

		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.Key.equals(K)) {
//			delete this temp node , with prev
				prev.next = temp.next;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	public String toString() {
		String ans = "";
		for (Node head : buckets) {
			ans = ans + "[";
			if (head != null) {
				Node temp = head;
				while (temp != null) {
					ans = ans + temp;
					temp = temp.next;
				}

			}
			ans = ans + "]";
		}
		return ans;
	}

	private void rehash() {

		ArrayList<Node> prev_pairs = buckets;
		size = 0;
		buckets = new ArrayList<>();
		for (int i = 0; i < prev_pairs.size() * 2; i++) {
			buckets.add(null);
		}
		for (Node head : prev_pairs) {

			if (head != null) {
				Node temp = head;
				while (temp != null) {
					this.put(temp.Key, temp.Val);
					temp = temp.next;
				}
			}
		}
	}
}
