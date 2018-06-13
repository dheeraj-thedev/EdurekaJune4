package co.edureka;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(112, "Jennie");
		map.put(203, "Fionna");
		map.put(454, "George");
		map.put(274, "Mike");
		map.put(906, "Leo");
		map.put(null, "Jim"); // null key is allowed
		map.put(888, null);   // null value is also allowed
		
		map.put(101, "Jack"); // Updating the key 101 with new value
		//map.remove(101);
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.get(101));
		
		if(map.containsKey(101)){
			System.out.println("101 is in the map");
		}
		if(map.containsValue("Leo")){
			System.out.println("Leo is in the map");
		}
		
		System.out.println("====================");
		
		// Iterating in the Map
		Set<Integer> keys = map.keySet(); // Returns a Set of Keys in the map
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println("====================");
		Set<Entry<Integer, String>> eSet = map.entrySet();
		Iterator<Entry<Integer, String>> eItr = eSet.iterator();
		while(eItr.hasNext()){
			Entry<Integer, String> entry = eItr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("====================");
		
		// Thread-Safe (No null key and no null value)
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(112, "Jennie");
		table.put(203, "Fionna");
		table.put(454, "George");
		//table.put(null, "George"); // null key is not allowed
		//table.put(133, null); // null value is not allowed
		System.out.println(table);
	}

}
