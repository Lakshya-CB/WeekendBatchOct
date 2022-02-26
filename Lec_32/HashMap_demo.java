package Lec_32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
//	HashMap<Key, Value>
		map.put("A", 10);
		map.put("A12", 10);
		map.put("31A", 10);
		map.put("A09", 10);
		map.put("A88", 10);

		System.out.println(map);
//		Get !!
		System.out.println(map.get("A"));
		System.out.println(map.get("0000A"));
//		Check if a pair exists or not?!
		System.out.println(map.containsKey("A000"));

//		remove!!
		System.out.println("==============");
		System.out.println(map.remove("A"));

//		System.out.println(map.remove("A"));
		System.out.println(map.get("A"));
//		update!!
		System.out.println(map.put("A12", 999));
		System.out.println(map.get("A12"));

		Set<String> Keys = map.keySet();

		ArrayList<String> kk = new ArrayList<>(Keys);
		for(String k : Keys) {
			System.out.println(k);
		}
	
		for(String k : map.keySet()) {
			System.out.println(k);
		}
		
		System.out.println(map.size());
		
		
	}
}
