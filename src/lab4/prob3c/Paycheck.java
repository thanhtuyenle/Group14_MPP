package lab4.prob3c;

public final class Paycheck {
	final double grossPay;
	final double fica;
	final double state;
	final double local;
	final double medicare;
	final double socialSecurity;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	void print() {
		System.out.println("	Gross Pay: " + grossPay);
		System.out.println("	Fica: " + fica);
		System.out.println("	State: " + state);
		System.out.println("	Local: " + local);
		System.out.println("	Medicare: " + medicare);
		System.out.println("	Social Security: " + socialSecurity);
		System.out.println("	NET PAY: " + getNetPay());
		
	}
	
	double getNetPay() {
		return grossPay - grossPay * fica - grossPay * state - grossPay * local - grossPay * medicare - grossPay * socialSecurity;
	}
	
	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	
	
	
}
