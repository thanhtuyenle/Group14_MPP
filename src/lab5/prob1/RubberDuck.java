package lab5.prob1;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("    displaying");
		
	}
	public RubberDuck() {
		setFlyBehavior((FlyBehavior) new CannotFly());
		setQuackBehavior((QuackBehavior) new Squeak());
	}
}
