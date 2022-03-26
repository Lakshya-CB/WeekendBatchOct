package Lec_HashMap_Trie;

public class Client {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 5);
		map.put("B", 12);
		map.put("V", 100);
		map.put("A3", 10);
		System.out.println(map);
		map.put("A", 990);
		System.out.println(map);
		map.put("A1", 10);
		map.put("A2", 10);
		map.put("A4", 10);
		map.put("A5", 10);
		System.out.println(map);
		map.put("A6", 10);
		System.out.println(map);
		map.put("A7", 10);
		System.out.println(map);
		
	}
}
