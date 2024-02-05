package NewJavaTest.LatestCoreJavaPractise;

public class StaticVarDemo {
	
	String name;  // Instance variable  because this is changing according to the values provided in the class object
	String address;  // Instance variable 
	static String city = "Banglore";  // This is class variable 
	static int i=0; // This will be shared by all the class object hence incremented 2 times as we have 2 class object which is obj and object 
	
	
	
	// OR we can also define an static block and then we can define our class or static variable inside that and from outside we can remove the values assigned to them
	
//	static {
//		
//		city = "banglore";
//		i=0;
//		
//	}
	// Now we are building a constructor
	
	public StaticVarDemo(String name, String address){
		
		this.name=name;  // This is local variable under the constructor
		this.address=address; // This is local variable under the constructor
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress() {
		
		System.out.println(address+" "+city);
	}
	
	public static void getCity() {
		
		System.out.println(city); // Static method accepts only static variable which is an class variable 
	}
	
	
	

	public static void main(String[] args) {
	
		
		StaticVarDemo obj = new StaticVarDemo("Adam","HSR");
		StaticVarDemo object = new StaticVarDemo("Rock","SilkBoard");
		
		
		obj.getAddress();
		object.getAddress();
		StaticVarDemo.getCity(); //For calling class method or static method we do not need object, we can directly call them through the class name
		StaticVarDemo.i=44; // Here i is also static so we are calling i through class name and we can assign value to i at the run time as well
		obj.address="Mine address"; // Here address is not static so we are calling this through object and can assign value at the run time 
		
		
		
		
		

	}

}
