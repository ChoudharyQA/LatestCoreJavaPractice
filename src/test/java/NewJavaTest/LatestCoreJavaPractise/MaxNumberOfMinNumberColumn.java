package NewJavaTest.LatestCoreJavaPractise;

public class MaxNumberOfMinNumberColumn {

	public static void main(String[] args) {
		// Here we are finding the max number under minimum number column
		
		int abc[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int min = abc[0][0];
		int minColumn=0;
	
		
		
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(abc[i][j]<min) {
					
					min=abc[i][j];
					minColumn=j;
				}
			}
		}
		
		
	
		
		int max = abc[0][minColumn];
		int k=0;
		while(k<3) {
			
			if(abc [k] [minColumn]>max){
				
				max = abc [k][minColumn];
				
				
			}
			
			k++;
		}
		
		
		System.out.println(max);

	}

}
