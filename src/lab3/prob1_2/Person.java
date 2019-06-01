package lab3.prob1_2;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	/*
		 * @Override public boolean equals(Object aPerson) { if(aPerson == null) return
		 * false; if(!(aPerson instanceof Person)) return false; Person p =
		 * (Person)aPerson; boolean isEqual = this.name.equals(p.name); return isEqual;
		 * }
		 */

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		
		if(aPerson instanceof Person) {
			Person p = (Person)aPerson;
			boolean isEqual = this.name.equals(p.name);
			return isEqual;
		}else if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob)aPerson;
			boolean isEqual = this.name.equals(p.getPerson().getName());
			return isEqual;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
