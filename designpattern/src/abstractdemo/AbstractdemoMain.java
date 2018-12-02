package abstractdemo;

public class AbstractdemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractParent abstractParent = new Child2(4);
		
		System.out.println();
		abstractParent.isAuthenticated();
		
		abstractParent.isvalid();
	}

}
