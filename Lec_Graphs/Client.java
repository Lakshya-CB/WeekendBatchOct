package Lec_Graphs;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		
		G.addEdge(1, 4, 10);
		G.addEdge(1, 2, 2);
		G.addEdge(2, 3, 3);
		G.addEdge(3, 4, 1);
		
		G.addEdge(4, 5, 8);
		G.addEdge(5, 6, 4);
		G.addEdge(5, 7, 6);
		G.addEdge(7, 6, 1);
		
		System.out.println(G.map);
		System.out.println(G.NumOfEdges());
		
//		G.hasPath(1, 7);
//		System.out.println(G.ll);
//		G.BFT();
//		System.out.println(G.Num_of_Comp());
		G.Dijkstra(1);
	}
}
