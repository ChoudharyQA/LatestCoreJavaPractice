package NewJavaTest.LatestCoreJavaPractise;

public class ChildClassAbstractConcept extends ParentclassAbstactConcept {

	public static void main(String[] args) {
		ChildClassAbstractConcept c = new ChildClassAbstractConcept();
		c.bodyColor();
		c.engine();
		c.safetyGuideLines();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("bodyColor");
	}

}
