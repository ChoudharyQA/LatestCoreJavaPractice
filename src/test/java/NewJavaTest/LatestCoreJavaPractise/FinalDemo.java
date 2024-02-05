package NewJavaTest.LatestCoreJavaPractise;

public class FinalDemo {

	public static void main(String[] args) {
	
		
		// final means access restrictions
		// We can use final on class level as well, replacing public with final and by doing this, we can's use any final class for inheritance or can't do extends
		//If we apply final on method, we can't overload or override that method, that method will be unique always
		// If we apply final on variable then that variable value become constant 
		
		
		final int i= 0;  // Now this variable i value always be the 0

	}
	
	
	final void getData() {
		
		// It means this method always be the final or unique method
	}

}
