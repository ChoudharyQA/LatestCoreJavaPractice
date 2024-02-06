package NewJavaTest.LatestCoreJavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hM= new HashMap<Integer,String>(); // Here integer is the key and String is its value
		hM.put(0, "Saurabh");
		hM.put(1, "Adam");
		hM.put(2, "Choudhary");
		hM.put(3, "Lock");
		hM.put(4, "Dike");
		
		System.out.println(hM.get(2));
		hM.remove(2); // here we are removing 2nd index value 
		System.out.println(hM.get(2)); // After removing 2nd index value when we try to print, it says null
		Set s=hM.entrySet(); // Now we have saved an set with both key and value in a combination
		 Iterator i=s.iterator(); // Now we need to print values at all the indexes
		 
		 while(i.hasNext()) {
			 
			 Map.Entry mP= (Map.Entry) i.next(); // Here we have used map.Entry because we need key and value in separation
			 System.out.println(mP.getKey()); // here we are getting key 
			 System.out.println(mP.getValue());// here we are getting value 
			 
			 
			 
			 // Difference between hashmap and hashtable- Famous interview question
			 
			 // Hashmap is non-synchronized means multiple prog can use hashmap at a time but in hastable, 2nd prog will wait for 1st prog to complete, it is synchronized.
			 // Hashmap allows "null" as a value & keys but in Hashtable, it is not allowed
			 // In Hashmap, we use Iterator but in Hashtable, we need to use enumerator
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		
		
		
		
		
	}

}
