package MappingClass;

import java.util.HashMap;
import java.util.Map;

public class Mapping1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// Inserting entries in the Map 
        // using put() method
		
		map.put("John", 100);
		map.put("vachin", 200);
		map.put("vishal", 300);
		
		
		for(Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
 
	}

}
