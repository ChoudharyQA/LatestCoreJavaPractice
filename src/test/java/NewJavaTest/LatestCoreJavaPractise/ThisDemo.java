package NewJavaTest.LatestCoreJavaPractise;

public class ThisDemo {

	int a=3;
	
	public static void main(String[] args) {
	
		// Here "this" refers to current class object variable not the method object variable
		
		// So "super" brings the value from the parent class and "this" brings the value from the current class object variable 
		
		ThisDemo t= new ThisDemo();
		t.getData();
		
		
		
		

	}
	
	
	public void getData() {
		
		int a=4;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);  // Here we are fetching variable from the class level not from the method level
		System.out.println(b);
	}

}
