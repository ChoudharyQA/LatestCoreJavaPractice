package NewJavaTest.LatestCoreJavaPractise;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int b=7;
		int c=0;
	
		
		try {
			int k= b/c;
			System.out.println(k);
		}
		catch(Exception e){  // Here we have used global exception which is "Exception" instead of this we can use error specific catch like in this case, we can use "ArithmeticException" as it is related to the arithmetic operations
			
			System.out.println("I am exceptional error");
		}
		
		finally {
			
			// This block will always execute even of the script fails
			// This always need to use with try blocks
			
			System.out.println("I will print in any of the cases");
		}
		
		
		

	}

	
	
	
}

// In one try block, we can use multiple catch blocks
// catch block must be followed by try block means after try block, we should have directly catch block in between these we should not have any other codes