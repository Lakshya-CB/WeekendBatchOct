package Lec_30_31;

import java.util.LinkedList;
import java.util.Queue;
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

	public BTree(int[] pre) {
		pre_idx = 0;
		root = ccpre(pre);

	}

	int pre_idx = 0;

	private Node ccpre(int[] pre) {
		if (pre[pre_idx] == -1) {
			pre_idx++;
			return null;
		}
		Node nn = new Node(pre[pre_idx]);
		pre_idx++;

		nn.left = ccpre(pre);
		nn.right = ccpre(pre);
		return nn;
	}

	public BTree() {
		// TODO Auto-generated constructor stub
//		Method 1
//		System.out.println(" root node ka data ?");
//		root = new Node(scn.nextInt());
//		create(root);
//		Method 2
		root = create2(null, true);

	}

	public BTree(int[] pre, int[] in) {
		root = cc(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	public Node cc(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		int data = pre[ps];
		Node nn = new Node(data);
//		find index for sp,in and pre!!
		int found = 0;
		int Ls = 0;
		for (int i = is; i <= ie; i++) {
			if (data == in[i]) {
				found = i;
				break;
			}
			Ls++;
		}
		nn.left = cc(pre, ps + 1, ps + Ls, in, is, found - 1);

		nn.right = cc(pre, ps + Ls + 1, pe, in, found + 1, ie);

		return nn;
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

	private Node create2(Node parent, boolean Lchild) {
		if (Lchild) {
			if (parent == null) {
				System.out.println("root hein ?");
			} else {
				System.out.println(parent.data + " ka left child hein ?");
			}
		} else {
			System.out.println(parent.data + " ka right child hein ?");
		}
		boolean hasN = scn.nextBoolean();
		if (!hasN) {
			return null;
		}
		if (Lchild) {
			if (parent == null) {
				System.out.println("root ka data batao !!");
			} else {
				System.out.println(parent.data + " ka left child ka data batao !!");
			}
		} else {
			System.out.println(parent.data + " ka right child ka data batao !!");
		}

		Node nn = new Node(scn.nextInt());

		nn.left = create2(nn, true);
		nn.right = create2(nn, false);

		return nn;
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

	int Max(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Max(nn.left);
		int R = Max(nn.right);
		return Math.max(nn.data, Math.max(L, R));
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
		boolean L = Find(nn.left, ali);
		boolean R = Find(nn.right, ali);
		return L || R;
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

	public int Dia() {
		return Dia2(root).Dia;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int selfD = Ht(nn.left) + Ht(nn.right) + 2;
//		System.out.println(nn.data+" ===> "+ L+ " , "+R + " , "+selfD);
		return Math.max(selfD, Math.max(R, L));
	}

	private HtDiaP Dia2(Node nn) {
		if (nn == null) {
			HtDiaP ans = new HtDiaP();
			ans.Ht = -1;
			ans.Dia = 0;
			return ans;
		}
		HtDiaP L = Dia2(nn.left);
		HtDiaP R = Dia2(nn.right);

		int selfD = L.Ht + R.Ht + 2;

		HtDiaP ans = new HtDiaP();
//		for ans!!!
//		1) Ht of the nn
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
//		2) Dia of the nn
		ans.Dia = Math.max(selfD, Math.max(R.Dia, L.Dia));
		System.out.println(nn.data + " ===> " + L + " , " + R + " , " + ans);
		return ans;
	}

	private class HtDiaP {
		int Ht;
		int Dia;

		@Override
		public String toString() {
			return "{ht= " + Ht + ", dia=" + Dia + "}";
		}
	}

	public boolean isBal() {
		return isBal(root);
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;

		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		if (L && R && self) {
//			self node is balanced 
			return true;
		} else {
			return false;
		}
	}

	private isBalHtP isBal2(Node nn) {
		if (nn == null) {
			return new isBalHtP();
		}
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;

		isBalHtP L = isBal2(nn.left);
		isBalHtP R = isBal2(nn.right);

		isBalHtP ans = new isBalHtP();
		ans.isBal = L.isBal && R.isBal && self;

		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		return ans;
	}

	private class isBalHtP {
		boolean isBal = true;
		int Ht = -1;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node temp = Q.poll();
			if (temp == null) {
				continue;
			}
			// Selfwork!!
			System.out.println(temp.data);
			Q.add(temp.left);
			Q.add(temp.right);

		}
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

	public BTree(int[] lvl, boolean bb) {
		create_LVL(lvl);

	}

	private void create_LVL(int[] lvl) {
		Queue<Node> Q = new LinkedList<>();
		int idx = 0;
		Node nn = new Node(lvl[idx]);
		idx++;
		root = nn;
		Q.add(nn);
		while (!Q.isEmpty()) {
			Node temp = Q.poll();
			if (lvl[idx] != -1) {
				temp.left = new Node(lvl[idx]);
				Q.add(temp.left);
			}
			idx++;
			if (lvl[idx] != -1) {
				temp.right = new Node(lvl[idx]);
				Q.add(temp.right);
			}
			idx++;
		}
	}

	public boolean isBST() {
		return isBST(root).isBST;
	}
//	private boolean isBST(Node nn) {
//		if(nn==null) {
//			return true;
//		}
//		boolean L = isBST(nn.left);
//		boolean R = isBST(nn.right);
//		
//		if(L && R) {
//			int L_max = Max(nn.left);
//			int R_min = Min(nn.right);
//			if(nn.data<R_min && nn.data>= L_max) {
//				return true;
//			}
//		}
//		return false;
//		
//	}

	private int Min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		// TODO Auto-generated method stub
		int L = Min(nn.left);
		int R = Min(nn.right);

		return Math.min(Math.min(L, R), nn.data);
	}

	class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		public String toString() {
			return "{ " + isBST + " max " + max + " min " + min + " }";
		}

	}

	private BSTPair isBST(Node nn) {
		if (nn == null) {
			return new BSTPair();
		}
		BSTPair L = isBST(nn.left);
		BSTPair R = isBST(nn.right);

		BSTPair ans = new BSTPair();

		if (L.isBST && R.isBST && nn.data < R.min && nn.data >= L.max) {
//			if (nn.data < R.min && nn.data >= L.max) {
//				ans.isBST = true;
//			} else {
//				ans.isBST = false;
//			}
			ans.isBST = true;
		} else {
			ans.isBST = false;
		}
//		create min!!
		ans.min = Math.min(nn.data, Math.min(L.min, R.min));

//		create max!!

		ans.max = Math.max(nn.data, Math.max(L.max, R.max));
//		System.out.println(L + " == " + ans + " == " + R);

		return ans;

	}

	public int BiggestBST() {
		return BiggestBST(root);
	}

	private int BiggestBST(Node nn) {
		if (isBST(nn).isBST) {
			return size(nn);
		}
		int L = BiggestBST(nn.left);
		int R = BiggestBST(nn.right);
		return Math.max(L, R);
	}

}