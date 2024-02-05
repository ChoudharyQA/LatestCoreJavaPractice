package NewJavaTest.LatestCoreJavaPractise;

public class OverridingConceptWithOverloading extends OverlloadingConcept{

	public static void main(String[] args) {
		
		
		OverlloadingConcept override= new OverridingConceptWithOverloading();
		override.getData(35);
		
		
		

	}

	
	
public void getData(int a ) {
		
		System.out.println(a);
	}
	
	// Same method we have in its parent class(Everything is same) which is overloadingConcept but so if we have same method in the child class then java given preference to child method it override the parent class method 
	// So this is called overriding, here child class method overrides the parent class method. Given- Both the methods are exact same 
	
	
}
