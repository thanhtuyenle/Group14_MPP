package lab4.prob3c;

public abstract class Employee {
	private String empId;
	
	
	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public void print(int month, int year) {
		System.out.println("Employee ID : " + empId);
		System.out.println("Paystub:");
		
		Paycheck p = calcCompensation(month - 1, year);
		p.print();
		
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		
		return new Paycheck(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);
	}
	
	public abstract double calcGrossPay(int month, int year);		
	
}
