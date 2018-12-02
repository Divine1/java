package abstractdemo;

public abstract class AbstractParent {

	private int parentint1;
	
	public AbstractParent(int parentint1) {
		this.parentint1 = parentint1;
	}
	
	public void isAuthenticated() {
		System.out.println("AbstractParent isAuthenticated"+parentint1);
	}
	
	public void isvalid() {
		System.out.println("AbstractParent isvalid"+parentint1);
	}
}
