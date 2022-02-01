package Lec_25_26_LL;

import java.util.Stack;

public class LinkedList {
	 class Node {
		int data;
		Node next;

		Node(int nn) {
			data = nn;
		}

		public String toString() {
			return "" + data;
		}
	}

	Node head;

	public LinkedList() {
		// TODO Auto-generated constructor stub
		Node nn1 = new Node(10);
		Node nn2 = new Node(20);
		Node nn3 = new Node(30);
		Node nn4 = new Node(40);

		nn1.next = nn2;
		nn2.next = nn3;
		nn3.next = nn4;

		head = nn1;
	}

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

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
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

	public void addLast(int data) {
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

	public void addFirst(int data) {
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

	public void addAt(int idx, int data) {
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

	public int removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Bhai dand rakh, Empty hein LL");
		}
		Node prev = getNodeAt(size() - 2);
		int ans = prev.next.data;
		prev.next = null;

		return ans;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Bhai dand rakh, Empty hein LL");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node Prev = getNodeAt(idx - 1);
			int ans = Prev.next.data;
			Prev.next = Prev.next.next;
			return ans;
		}
	}

	public void rev() {
		Node prev = head;
		Node curr = prev.next;
		while (curr != null) {
			Node after = curr.next;
			curr.next = prev;
//			Update your prev and curr
			prev = curr;
			curr = after;

		}
		head.next = null;
		head = prev;
	}

	private void rev2(Node prev) {
		if (prev.next == null) {
			head = prev;
			return;
		}
		rev2(prev.next);
////		Node curr = prev.next;
////		curr.next=prev;
		prev.next.next = prev;
	}

	public void rev2() {
		Node prev_Head = head;
		rev2(head);
		prev_Head.next = null;
	}

	public int mid() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int LastK(int k) {

		Node fast = head;
		while (k != 0) {
			fast = fast.next;
			k--;
		}

		Node slow = head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public int inter(Node head1, Node head2) {
		Node carA = head1;
		Node carB = head2;

//		while(true) {
//			carA =  carA.next;
//			carB =  carB.next;
//			
//			
//			
//			if(carA==null) {
//				carA = head2;
//			}
//			if(carB==null) {
//				carB = head1;
//			}
//			if(carA==carB) {
//				return carA.data;
//			}
//		}
		while (carA != carB) {
			carA = carA.next;
			carB = carB.next;
			if (carA == carB && carA == null) {
				return carA.data;
			}

			if (carA == null) {
				carA = head2;
			}
			if (carB == null) {
				carB = head1;
			}
		}
		return carA.data;
	}

	public void K_Rev(int k) {
		Node temp = head;
		Stack<Node> S = new Stack<>();

		Node newHead = null;
		Node newTail = null;

		while (temp != null) {
			if (S.size() < k) {
				S.add(temp);
				temp = temp.next;
			}
			if (S.size() == k) {
//				System.out.println(S);
				while (!S.isEmpty()) {
					Node nn = S.pop();
					if (newTail == null) {
//						System.out.println("NewLL tail got updated to " + nn.data);
						newTail = nn;
						newHead = nn;
					} else {
//						if (temp != null)
//							System.out.println(nn.data + " connected to " + newTail.data + "  -- " + temp.data);
//						else
//							System.out.println(nn.data + " connected to " + newTail.data + "  -- " + null);

						newTail.next = nn;
						newTail = nn;
					}
				}
			}
		}
		while (!S.isEmpty()) {
			Node nn = S.pop();
			newTail.next = nn;
			newTail = nn;
		}
		newTail.next = null;
		head = newHead;
	}

	public boolean hasCycle() {
		Node fast = head;
		Node slow = head;
		while (fast != slow) {
			if (fast == null || fast.next == null) {
				return false;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return true;
	}
}
