package NewJavaTest.LatestCoreJavaPractise;

public class ConstructorDemo {

	
		
		// Below is the default constructor, we created. In this we do not have any parameters
		public ConstructorDemo() {  // Here it is not returning anything
			
			System.out.println("I am Constructor");
		}
		
		
		//Above is the constructor we defined on the name of call because constructor has below properties 
		//This should always on the name of the class
		// This should not return anything 
		// And if you will not define any constructor explicitly then automatic one constructor is called to execute on the creation of the class object
		// So once class object created, automatically a constructor called in the background
		
		
		
		
		// Below is the parameterized constructor 
		
		
	public ConstructorDemo(int a, int b) {    
			int c = a+b;
			System.out.println(c);
		}
		
	
	public ConstructorDemo(String str) {    
		
		System.out.println(str);
	}
		
		
	//NOTE = If we have defined any constructor manually or explicitly then java will not look for implicit or default constructor 	
	// So either we need to remove the explicit constructor to run the default constructor which always execute automatically in the background when class object created 
	// or We need to properly define the explicit constructor to run.
	// and also once explicit constructor  defined then for running the default constructor we need to write the code like in this session we have written
	// Explicitly means manually creation 
		
		
		
		
		public void getData() {
			
			System.out.println("I am the method");
		}
		
		
		
		
		public static void main(String[] args) {

	
			ConstructorDemo cons= new ConstructorDemo(); // Here we have created constructor for the class, now if i run the code, the constructor code will execute automatically 
			// The above object involved in default constructor 
			ConstructorDemo consP= new ConstructorDemo(4,5); // This involved in parameterized constructor
			ConstructorDemo consPS= new ConstructorDemo("Hello"); // This involved in parameterized constructor
		}	
}
