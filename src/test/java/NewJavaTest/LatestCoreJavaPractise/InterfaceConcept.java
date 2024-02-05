package NewJavaTest.LatestCoreJavaPractise;

public class InterfaceConcept implements TrafficRules,ContinentalTraffic{

	public static void main(String[] args) {
	
		TrafficRules a= new InterfaceConcept();
		a.greenGo();
		a.flushYellow();
		a.redStop();
		
		
		InterfaceConcept at = new InterfaceConcept();
		at.walkIn();
		
		ContinentalTraffic ct= new InterfaceConcept();
		ct.trainSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}
	
	public void walkIn() {
		System.out.println("walkin");
	}

	@Override
	public void flushYellow() {
		// TODO Auto-generated method stub
		System.out.println("flushYellow implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol");
	}

}
