package Lec_HashMap_Trie;

public class Clinet_Trie {
	public static void main(String[] args) {
		Trie T = new Trie();
		T.addWord("ant");
		T.addWord("arc");
		T.addWord("and");
		T.addWord("see");
		T.addWord("sea");
		T.addWord("seen");
		T.addWord("an");
		T.DispWords();
		System.out.println(T.ContainsWord("se"));
	}
}
