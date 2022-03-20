package Lec_Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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
	public boolean BFS(int V1 , int V2) {
		Queue<Integer> Q = new LinkedList<Integer>();
		HashSet<Integer> Visited = new HashSet<>();
		while(!Q.isEmpty()) {
			int curr_place = Q.poll();
			if(Visited.contains(curr_place)) {
				System.out.println("Cycle hein!!");
				continue;
			}
			Visited.add(curr_place);
			for(int nbr : map.get(curr_place).keySet()) {
				if(!Visited.contains(nbr))
					Q.add(nbr);
			}
		}
	}
}
