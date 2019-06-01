package lab5.prob1;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();
	
	public void swim() {
		System.out.println("    swimming");
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void fly() {
		flyBehavior.fly();
	}
}
