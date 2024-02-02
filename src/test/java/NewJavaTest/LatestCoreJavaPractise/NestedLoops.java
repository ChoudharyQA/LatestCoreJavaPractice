package NewJavaTest.LatestCoreJavaPractise;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1;i<=4;i++) {
			
			System.out.println("Outer Loop Started");
			
			for(int j=1;j<=4;j++) {
				
				System.out.println("Inner Loop");
				
			}
			
			System.out.println("Outer Loop Finished");
			
		}
		
		
		// So for completed 1 outer loop we need to complete 4 inner loops hence we can say 1 outer loop = 4 inner loops
		//So both the loops run 16 times because outer and inner both loops have 4 values 
		// If outer loop run by 4 times then at the same time inner loops runs 16 times
		//Hence we can say 4 outer loop is equal to 16 inner loops
		
		
		
}
}