package abstractdemo;

public class Child2 extends Child1 {
	private int parentint1;
	
	public Child2(int parentint1) {
		super(parentint1);
		this.parentint1 = parentint1;
	}
	
	public void isAuthenticated() {
		System.out.println("Child2 "+parentint1);
	}
}
