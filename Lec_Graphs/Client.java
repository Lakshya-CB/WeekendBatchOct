package Lec_Graphs;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		
		G.addEdge(1, 4, 6);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 4, 3);
		
		G.addEdge(4, 5, 8);
		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 14);
		G.addEdge(7, 6, 13);
		
		System.out.println(G.map);
		System.out.println(G.NumOfEdges());
		
		G.hasPath(1, 7);
//		System.out.println(G.ll);
		
	}
}
