package abstractdemo;

public class Child1 extends AbstractParent{
	public Child1(int parentint1) {
		super(parentint1);
		// TODO Auto-generated constructor stub
	}

	private int parentint1;

	public void isAuthenticated() {
		System.out.println("Child1 "+parentint1);
	}
}
