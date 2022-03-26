package Lec_HashMap_Trie;

import java.util.HashMap;

public class Trie {
	class Node {
		public Node(char c) {
			// TODO Auto-generated constructor stub
			ch = c;
			children = new HashMap<Character, Node>();
		}

		char ch;
		boolean EOW; // wne of word!!
		HashMap<Character, Node> children;

	}

	Node Head;

	public Trie() {
		// TODO Auto-generated constructor stub
		Head = new Node('*');
	}

	public void addWord(String str) {
		addWord(Head, str);
	}

	private void addWord(Node nn, String str) {
		if (str.isEmpty()) {
			nn.EOW = true;
			return;
		}
		char ch = str.charAt(0);
		if (nn.children.containsKey(ch)) {
			addWord(nn.children.get(ch), str.substring(1));
		} else {
			Node child = new Node(ch);
			nn.children.put(ch, child);
			addWord(child, str.substring(1));

		}
	}

	public void DispWords() {
		Disp(Head, "");
	}

	private void Disp(Node nn, String path) {
		if (nn.EOW) {
			System.out.println(path);
		}
//		System.out.println(path);
		for (char ch : nn.children.keySet()) {
			Node child = nn.children.get(ch);
			Disp(child, path + ch);
		}
	}

	public boolean ContainsWord(String word) {
		return Find(Head, word);
	}

	private boolean Find(Node nn, String str) {
		if(str.isEmpty()) {
			return nn.EOW;
		}
		char ch = str.charAt(0);
		if (nn.children.containsKey(ch)) {
			return Find(nn.children.get(ch), str.substring(1));
		}else {
			return false;
		}
	}

}
