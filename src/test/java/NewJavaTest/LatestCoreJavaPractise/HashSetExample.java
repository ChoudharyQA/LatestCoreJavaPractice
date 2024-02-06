package NewJavaTest.LatestCoreJavaPractise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		// Set does not accept duplicate values
		//There is no guarantee that elements stored in sequence or in specific order, they will be in random order.
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Saurabh");
		hs.add("Choudhary");
		hs.add("Choudhary"); // Adding values
		hs.add("Ashu");
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		System.out.println(hs);
		System.out.println(hs.remove("Ashu")); // Removing values
		System.out.println(hs.isEmpty()); // if its empty then it will give true otherwise false
		System.out.println(hs.size()); //Checking size of the list
		
		// It will not accept duplicate values
		
		
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		System.out.println("Values Finished");
		
		
		
		
		
	}

}
