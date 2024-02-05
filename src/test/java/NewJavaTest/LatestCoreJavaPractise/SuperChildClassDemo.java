package NewJavaTest.LatestCoreJavaPractise;

public class SuperChildClassDemo extends SuperParentClassDemo{
	
	String name ="Choudhary";
	
	//As we can see that we have same variable defined "name" in both parent and child class
	//So we can call name variable then it gives priority to child first, it picks the "name" value from the child class instead of parent class
	// So we want to take "name" value from parent class then we need to use "super" keyword, as used below
	

	public static void main(String[] args) {
	
		SuperChildClassDemo sC= new SuperChildClassDemo();
		sC.getStringData();
		sC.getData();
		
		

	}

	
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name); // Here we also want "name" value from parent class so used "super" keyword
	}
	
	public void getData() {
		
		super.getData(); // Here we are using same method from the parent class by using "super" keyword 
		System.out.println("I belongs to the child class");
	}
	
	
	public SuperChildClassDemo() { // Here this is an constructor as it is not returning anything 
		
		
		super(); // Here I am using my parent class constructor but for this make sure that - We should use "super" keyword and this "super" keyword should be on the first line in code
		System.out.println("I am child class constructor");
	}
	
	
	
	
}

