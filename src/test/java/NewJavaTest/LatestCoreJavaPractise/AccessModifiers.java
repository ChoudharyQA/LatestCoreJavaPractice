package NewJavaTest.LatestCoreJavaPractise;

public class AccessModifiers {

	int i=0;
	
	// public int i=0;
	
	// This is an default modifier variable that can be used anywhere only with in the package and if we want to use this outside the package then first we need to import the package and need to make this public.
	
	public static void main(String[] args) {
		

	}
	
	
	void getData() {
		
		// This is an default modifier method that can be used anywhere only with in the package and if we want to use this outside the package then first we need to import the package and need to make this public.
		// public void getData()
	}

}

//	Note - 
//	Private - We even can't use method or variable outside the same package class itself
// public - (Methods, variables and class )We can use anywhere with in the package and for outside the package, we can import the package and can use it.
// Protected - (Methods, variables and class )It can be used within the same package classes without any inheritance  and for using outside the package, first we need to import the package and then apply inheritance then only we can use this.