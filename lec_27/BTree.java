package lec_27;

import java.util.Scanner;

public class BTree {
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
	static Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		System.out.println(" root node ka data ?");
		root = new Node(scn.nextInt());
		create(root);

	}

	private void create(Node parent) {
		System.out.println(parent.data + " ka left child hein ?");
		boolean hasL = scn.nextBoolean();
		if (hasL) {
			System.out.println(parent.data + " ka left child ka data batao !!");
			Node left = new Node(scn.nextInt());
			parent.left = left;
			create(left);
		}

		System.out.println(parent.data + " ka right child hein ?");
		boolean hasR = scn.nextBoolean();
		if (hasR) {
			System.out.println(parent.data + " ka right child ka data batao !!");
			Node R = new Node(scn.nextInt());
			parent.right = R;
			create(R);
		}
	}

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null)
			return;
		String ans = "";
		if(nn.left!=null)
			ans = nn.left.data + "";
		
		ans = ans + "=>"+nn.data+"<=";
		if(nn.right!=null)
			ans = ans + nn.right.data ;
		
		System.out.println(ans);
		disp(nn.left);
		disp(nn.right);
	}


	public int size() {
		return size(root);
	}
	private int size(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L+R+1;
	}
	public int Max() {
		return Max(root);
	}
	 int Max(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L = Max(nn.left);
		int R = Max(nn.right);
		return Math.max(nn.data, Math.max(L, R));
	}
	public boolean Find(int ali) {
		return Find(root,ali);
	}
	private boolean Find(Node nn, int ali) {
		if(nn==null) {
			return false;
		}
		if(nn.data == ali) {
			return true;
		}
		boolean L = Find(nn.left,ali);
		boolean R = Find(nn.right,ali);
		return L||R;
	}
}
