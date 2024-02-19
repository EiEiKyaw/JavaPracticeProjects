package MappingClass;

import java.util.HashMap;
import java.util.Map;

public class AddingElement {

	public static void main(String[] args) {
//		
//		// Default Initialization of a 
//        // Map 
//		Map<Integer, String> hm1 = new HashMap<>();
//		
//		 // Initialization of a Map 
//        // using Generics 
//		
//		Map<Integer, String> hm2 = new HashMap<Integer, String>();
//		
//		hm1.put(1, "Geeks");
//		hm1.put(2, "For");
//		hm1.put(3, "Geeks");
//		
//		hm2.put(new Integer(1), "Geeks");
//		
//		
//		System.out.println(hm1);
//		System.out.println(hm2);
		
		Map<Integer, String> hm1 
        = new HashMap<Integer, String>(); 

    // Inserting the Elements 
    hm1.put(new Integer(1), "Geeks"); 
    hm1.put(new Integer(2), "Geeks"); 
    hm1.put(new Integer(3), "Geeks"); 

    System.out.println("Initial Map " + hm1); 

    hm1.put(new Integer(2), "For"); 

    System.out.println("Updated Map " + hm1); 
	}

}
