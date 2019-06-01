package lab5.prob1;

public class DecoyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("    displaying");
		
	}
	
	public DecoyDuck() {
		setFlyBehavior((FlyBehavior) new CannotFly());
		setQuackBehavior((QuackBehavior) new MuteQuack());
	}

}
