package NewJavaTest.LatestCoreJavaPractise;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
		
		int a[][]= new int [2][3];
		a[0][0]=2;
		a[0][1]=3;
		a[0][2]=4;
		a[1][0]=5;  // a[row][column]
		a[1][1]=6;
		a[1][2]=7;
		
		//OR
		
	//	int b[][]= {{2,3,4},{5,6,7}};   This is the simple and best form for multi dimensional array like first all rows value and in second, all column values
		
		
		//System.out.println(a[1][1]);
		
		// System.out.println(b[1][1]);
		
		//When we want to iterate all the array values then use belwo code
		
		for (int i=0;i<2;i++) {  // This loop is used for rows
			
			for(int j=0;j<3;j++) { // And this loop is used for colums
				
				System.out.println(a[i][j]);
				
			}
		}
		
		
		
		
		

	}

}
