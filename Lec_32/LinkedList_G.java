package Lec_32;

import java.util.ArrayList;

public class LinkedList_G <KUKKI> {
	class Node {
		KUKKI data;
		Node next;

		Node(KUKKI nn) {
			data = nn;
		}

		public String toString() {
			return "" + data;
		}
	}

	Node head;


	
	public void disp() {
		Node temp = head;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("]");
	}

	public int size() {
		Node temp = head;
		int ans = 0;
		while (temp != null) {
//			System.out.println(temp.data);
			temp = temp.next;
			ans++;
		}
		return ans;
	}

	public KUKKI getFirst() {
		return head.data;
	}

	public KUKKI getLast() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public KUKKI getAt(int idx) {
		Node temp = head;
		while (idx != 0) {
			temp = temp.next;
			idx--;
		}
		return temp.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(KUKKI data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(KUKKI data) {
		Node nn = new Node(data);
		nn.next = head;
		head = nn;
	}

	private Node getNodeAt(int idx) {
		Node temp = head;
		while (idx != 0) {
			temp = temp.next;
			idx--;
		}
		return temp;
	}

	public void addAt(int idx, KUKKI data) {
		if (size() == idx) {
			addLast(data);
		} else if (idx == 0) {
			addFirst(data);
		} else {
			Node prev = getNodeAt(idx - 1);
			Node after = prev.next;

			Node nn = new Node(data);
			prev.next = nn;
			nn.next = after;
		}
	}

	public KUKKI removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Bhai dand rakh, Empty hein LL");
		}
		Node prev = getNodeAt(size() - 2);
		KUKKI ans = prev.next.data;
		prev.next = null;

		return ans;
	}

	public KUKKI removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Bhai dand rakh, Empty hein LL");
		}
		KUKKI ans = head.data;
		head = head.next;
		return ans;
	}

	public KUKKI removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node Prev = getNodeAt(idx - 1);
			KUKKI ans = Prev.next.data;
			Prev.next = Prev.next.next;
			return ans;
		}
	}
}