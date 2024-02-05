package NewJavaTest.LatestCoreJavaPractise;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int a[]= new int[5]; // Here we are are declaring and allocating memory to the array value having 5 length
		
		a[0]=3;
		a[1]=4;
		a[2]=5;
		a[3]=6;  // Declaring array values
		a[4]=7;
		
		//OR
		
		
		// int b []= {1,2,3,4,5};  This is  the best way to declare the array on the run time
		
		
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]); // retrieving the array values
		}
		
		
		
		
	}

}
