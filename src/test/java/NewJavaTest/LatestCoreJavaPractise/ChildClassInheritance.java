package NewJavaTest.LatestCoreJavaPractise;

public class ChildClassInheritance extends ParentClassInheritance {

	public static void main(String[] args) {
		
		ChildClassInheritance cc= new ChildClassInheritance();
		cc.engine();
		cc.light();
		cc.brake();
		cc.color();
		
		
		
		
		
		
}

	
	public void color() {
		
		System.out.println(color);
	}	
		
		

	

	
	public void light() {
		
		System.out.println("light");
	}
	
	
}
