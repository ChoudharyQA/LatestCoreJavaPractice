package NewJavaTest.LatestCoreJavaPractise;

public class NestedLoopsPractice3 {

	public static void main(String[] args) {
		
	int 	k=3;
		for (int i=1;i<6;i++) {
			
			
			for(int j=3;j<=i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k= j*2;
				i++;
				
				
				
			}
			
			System.out.println("");
			
		}
		
		
		// So for completed 1 outer loop we need to complete 4 inner loops hence we can say 1 outer loop = 4 inner loops
		//So both the loops run 16 times because outer and inner both loops have 4 values 
		// If outer loop run by 4 times then at the same time inner loops runs 16 times
		//Hence we can say 4 outer loop is equal to 16 inner loops
		
		
		
}
}