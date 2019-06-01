package lab3.prob1;

public class PersonWithJob extends Person {
	
	private double salary;
	private Person person;
	public double getSalary() {
		return salary;
	}
	
	public Person getPerson() {
		return person;
	}

	PersonWithJob(String n, double s, Person p2) {
		super(n);
		salary = s;
		person = p2;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p2 = new Person("Joe");
		Person p1 = new PersonWithJob("Joe", 30000, p2);
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
