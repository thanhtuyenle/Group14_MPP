package lab2.prob2A;

public class Main {
	public static void main(String[] args) {
		Student std = new Student("Bob");
		System.out.println("Student Name:" + std.getStudentName());
		
		GradeReport grade = std.getGradeReport();
		grade.setGrade("7");
		System.out.println("Student Grade:" + grade.getGrade());
		
		
	}
}
