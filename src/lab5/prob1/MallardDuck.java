package lab5.prob1;

public class MallardDuck extends Duck{

	
	@Override
	public void display() {
		System.out.println("    display");
		
	}
	
	public MallardDuck() {
		setFlyBehavior((FlyBehavior) new FlyWithWings());
		setQuackBehavior((QuackBehavior) new Quack());
	}
}
