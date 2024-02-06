package NewJavaTest.LatestCoreJavaPractise;

import java.util.ArrayList;

public class arrayListExamples {
	
	
	//ArraList,LinkedList,vector- Implementing List interface and can accept duplicate values 
	//array have fixed size where as Array list can grow dynamically 
	
	

	public static void main(String[] args) {
	
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Saurabh");
		a.add("Choudhary");
		System.out.println(a);
		a.add(0, "Adam");  // At 0th index, I am adding this String 
		System.out.println(a);
		a.remove(1); // Here we are removing value from 1st index
		System.out.println(a);
		a.remove("Choudhary"); // Here we are removing this value - Choudhary
		System.out.println(a);
		a.get(0); // Here we are getting value at 0th index
		System.out.println(a);
		a.contains("Testing"); // Here we are finding if in our list, Do we have any "Testing" string 
		System.out.println(a.contains("Testing"));
		System.out.println(a.indexOf("Adam")); // Here we are getting the index of "Adam"
		System.out.println(a.isEmpty()); // Here we are checking if we have any values in the list or not. If its empty then it will give true otherwise false
		System.out.println(a.size()); // Here we are getting the size of out list
		a.add("Adam");
		System.out.println(a);
		
		
		// It can accept duplicate values
		// It will print values in sequence
		
		
		
		// In ArrayList, we use Size to count the records available in the list 
		// In Array, we use length to count the records available in the list 
		
		
		
		
		
		

	}

}
