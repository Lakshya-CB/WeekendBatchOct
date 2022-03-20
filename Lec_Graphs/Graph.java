package Lec_Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
//	undirected , weighted!!
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int V) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}
		System.out.println(map);
	}

	public void addEdge(int v1, int v2, int W) {
		HashMap<Integer, Integer> v1_nbr = map.get(v1);
		v1_nbr.put(v2, W);

		HashMap<Integer, Integer> v2_nbr = map.get(v2);
		v2_nbr.put(v1, W);

	}

	public boolean isNbr(int V1, int V2) {
		return map.get(V1).containsKey(V2);

	}

	public int removeEdge(int v1, int v2) {
		int w = map.get(v1).remove(v2);
		map.get(v2).remove(v1);
		return w;
	}

	public int NumOfEdges() {
		int num = 0;
//		for(int V1 : map.keySet()) {
//			for(int nbr_v1 : map.get(V1).keySet()) {
//				num++;
//			}
//		}
		for (int V1 : map.keySet()) {
			num = num + map.get(V1).size();
		}
		return num / 2;
	}

	public boolean hasPath(int V1, int V2) {
		return hasPath(V1, V2, new HashSet<>(), "");
	}

	private boolean hasPath(int V1, int V2, HashSet<Integer> Visited, String path) {
		if (V1 == V2) {
			System.out.println(path + " " + V1);

			return true;
		}
		if (Visited.contains(V1)) {
			return false;
		}
		Visited.add(V1);
//		System.out.println(V1+" _ "+V2+" , "+path+ " , "+Visited);

		boolean flag = false;
		for (int nbr_v1 : map.get(V1).keySet()) {
			flag = hasPath(nbr_v1, V2, Visited, path + " " + V1) || flag;
		}
		Visited.remove(V1);
		return flag;
	}

	public void BFS(int V1, int V2) {
		Queue<Integer> Q = new LinkedList<Integer>();
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int curr_place = Q.poll();
			if (Visited.contains(curr_place)) {
				System.out.println("Cycle hein!!");
				continue;
			}
			Visited.add(curr_place);
			for (int nbr : map.get(curr_place).keySet()) {
				if (!Visited.contains(nbr))
					Q.add(nbr);
			}
		}
	}

	public boolean BFSearch(int V1, int V2) {
		Queue<Integer> Q = new LinkedList<Integer>();
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int curr_place = Q.poll();
			if (curr_place == V2) {
				return true;
			}
			if (Visited.contains(curr_place)) {
//				System.out.println("Cycle hein!!");
				continue;
			}
			Visited.add(curr_place);
			for (int nbr : map.get(curr_place).keySet()) {
				if (!Visited.contains(nbr))
					Q.add(nbr);
			}
		}
		return false;
	}

	public void DFS(int V1, int V2) {
		Stack<Integer> S = new Stack<Integer>();
		HashSet<Integer> Visited = new HashSet<>();
		while (!S.isEmpty()) {
			int curr_place = S.pop();

			Visited.add(curr_place);
			for (int nbr : map.get(curr_place).keySet()) {
				if (!Visited.contains(nbr))
					S.add(nbr);
			}

		}
	}

	public void BFT() {
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : map.keySet()) {
			if (Visited.contains(V)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr_place = Q.poll();
				if (Visited.contains(curr_place)) {
//				System.out.println("Cycle hein!!");
					continue;
				}
				System.out.println(curr_place);

				Visited.add(curr_place);
				for (int nbr : map.get(curr_place).keySet()) {
					if (!Visited.contains(nbr))
						Q.add(nbr);
				}
			}
		}
	}

	public int Num_of_Comp() {
		int ans = 0;
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : map.keySet()) {
			if (Visited.contains(V)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V);
			ans++;
			while (!Q.isEmpty()) {
				int curr_place = Q.poll();
				if (Visited.contains(curr_place)) {
//				System.out.println("Cycle hein!!");
					continue;
				}
//				System.out.println(curr_place);

				Visited.add(curr_place);
				for (int nbr : map.get(curr_place).keySet()) {
					if (!Visited.contains(nbr))
						Q.add(nbr);
				}
			}
		}
		return ans;
	}

	public boolean isTree() {
		return Num_of_Comp() == 1 && !isCyclic();
	}

	public boolean isCyclic() {
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : map.keySet()) {
			if (Visited.contains(V)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr_place = Q.poll();
				if (Visited.contains(curr_place)) {
					return true;
				}
				System.out.println(curr_place);

				Visited.add(curr_place);
				for (int nbr : map.get(curr_place).keySet()) {
					if (!Visited.contains(nbr))
						Q.add(nbr);
				}
			}
		}
		return false;
	}

	public void Dijkstra(int src) {
		PriorityQueue<Dijkstra_P> PQ = new PriorityQueue<Dijkstra_P>();
		HashSet<Integer> Visited = new HashSet<>();
		PQ.add(new Dijkstra_P(src, 0));

		while (!PQ.isEmpty()) {
			Dijkstra_P curr_place_P = PQ.poll();
			int curr_place = curr_place_P.V;
			int curr_cost = curr_place_P.total_path_cost;

			if (Visited.contains(curr_place)) {
				continue;
			}
			System.out.println(curr_place_P);
			Visited.add(curr_place);
			for (int nbr : map.get(curr_place).keySet()) {
				if (!Visited.contains(nbr)) {
					int Edge_W = map.get(curr_place).get(nbr);
					PQ.add(new Dijkstra_P(nbr, curr_cost + Edge_W));
				}
			}
		}
	}

	class Dijkstra_P implements Comparable<Dijkstra_P> {
		int V;
		int total_path_cost;

		public Dijkstra_P(int vv, int cost) {
			// TODO Auto-generated constructor stub
			V = vv;
			total_path_cost = cost;

		}
		public String toString() {
			return this.V + " with cost "+total_path_cost;
		}
		@Override
		public int compareTo(Dijkstra_P o) {
			// TODO Auto-generated method stub

			return this.total_path_cost - o.total_path_cost;
		}

	}
}
