package NewJavaTest.LatestCoreJavaPractise;

public class OverlloadingConcept {

	public static void main(String[] args) {
		
		
		OverlloadingConcept o= new OverlloadingConcept();
		
		o.getData(10);
		o.getData("Capital b");
		o.getData(2, 5);
		
		
		

	}

	public void getData(int a ) {
		
		System.out.println(a);
	}
	
	
	public void getData(String b) {
		
		System.out.println(b);
	}
	
	
	public void getData(int a,int b) {
		
		System.out.println(a);
		System.out.println(b);
		
	}	
	
	
	
	
	// Overloading means, different methods with the same name but differs in argument type or the argument count 
	
	
}
