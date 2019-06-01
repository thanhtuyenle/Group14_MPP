package lab5.prob1;

public class RedheadDuck extends Duck{

	@Override
	public void display() {
		System.out.println("    displaying");
		
	}

	public RedheadDuck() {
		setFlyBehavior((FlyBehavior) new FlyWithWings());
		setQuackBehavior((QuackBehavior) new Quack());
	}
}
