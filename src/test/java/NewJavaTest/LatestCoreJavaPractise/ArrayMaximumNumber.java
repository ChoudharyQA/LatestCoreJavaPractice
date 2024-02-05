package NewJavaTest.LatestCoreJavaPractise;

public class ArrayMaximumNumber {

	public static void main(String[] args) {
		int abc[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int max = abc[0][0];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(abc[i][j]>max) {
					
					max=abc[i][j];
				}
			}
		}
		
		
		System.out.println(max);
		

	}

}
