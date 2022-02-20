package Lec_30_31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lec_30_31.BTree.Node;

public class BST {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int d) {
			// TODO Auto-generated constructor stub
			data = d;
		}
	}

	Node root;

	BST() {

	}

	public void lvl2() {
		Queue<Node> Curr_Q = new LinkedList<>();
		Queue<Node> Next_Q = new LinkedList<>();

		Curr_Q.add(root);
		while (!Curr_Q.isEmpty()) {
			Node temp = Curr_Q.poll();

			// Selfwork!!
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				Next_Q.add(temp.left);

			}
			if (temp.right != null) {
				Next_Q.add(temp.right);

			}
			if (Curr_Q.isEmpty()) {
				Curr_Q = Next_Q;
				Next_Q = new LinkedList<>();
				System.out.println();
			}
		}
	}

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null)
			return;
		String ans = "";
		if (nn.left != null)
			ans = nn.left.data + "";

		ans = ans + "=>" + nn.data + "<=";
		if (nn.right != null)
			ans = ans + nn.right.data;

		System.out.println(ans);
		disp(nn.left);
		disp(nn.right);
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public boolean Find(int ali) {
		return Find(root, ali);
	}

	private boolean Find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		}
		if (nn.data < ali) {
			return Find(nn.right, ali);
		} else {
			return Find(nn.left, ali);

		}
	}

	public int Ht() {
		return Ht(root);
	}

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		return Math.max(L + 1, R + 1);
	}

	public void add(int ali) {
		root = add(root, ali);

	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data < ali) {
			nn.right = add(nn.right, ali);
		} else {
			nn.left = add(nn.left, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
			return nn;
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
			return nn;
		} else {
//			case 1: leaf Node
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2: 1 child only
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
//			case 3: 2 bacche
//			update the node!!
			nn.data = Max(nn.left);
			System.out.println("OOO"+nn.data);
			nn.left = remove(nn.left, nn.data);
			return nn;
		}
		

	}
}
