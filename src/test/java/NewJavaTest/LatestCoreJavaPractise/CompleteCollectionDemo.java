package NewJavaTest.LatestCoreJavaPractise;

import java.util.ArrayList;

public class CompleteCollectionDemo {

	public static void main(String[] args) {
	
		// Here we will find the unique number from the list along with the count - Amazon interview question
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		ArrayList <Integer> aL = new ArrayList<Integer>();  // Creating empty ArrayList so that we can save array values in ArrayList
		
		for(int i=0;i<a.length;i++) { // going through each and every value in array
			int k=0; // Initiated the count variable
			if(!aL.contains(a[i])) {  // If arrayList do not contain the array value then it will go inside the loop as we have used ! means the the opposite case
				
				aL.add(a[i]);  // We are pushing array vales in the ArrayList
				k++; // Once added array value into ArrayList, we will increase the array value count by 1 (Means that number came 1st time) which we have stored in k variable
				
				for(int j=i+1;j<a.length;j++) { // Now initiating a new variable j to check further array values
					
					if(a[i]==a[j]) { // If we found the same array value or number again in upcoming or further array values or number then the already existed count will increase by 1 (Means that number came 2nd time) which we saved in k variable 
						
						k++; // Loops continues to check all the array values or numbers  and once ends we will print the desired values 
						
					}
				}
				
				
				System.out.println(a[i]); // Here we are printing the array values
				System.out.println(k);// Here we are printing the count repeated array values 
				if(k==1) { // If any value has count 1 means k=1 means that number value or number is unique
					
					System.out.println(a[i]  + " " + "is my unique number");  // Here we are printing the value of the array which has k=1, means repeated only for single time
				}
			}
		}
		

	}

}
