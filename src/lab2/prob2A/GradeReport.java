package lab2.prob2A;

public class GradeReport {

	private Student student;
	private String grade;

	//package level
	GradeReport(Student stu) {
		student = stu;
	}
	
	GradeReport(String inputedName, String inputedStudent){
		this.grade = inputedName;
		student = new Student(inputedStudent);
	}
	
	public Student getStudent() {
		return student;
	}
	public void setGrade(String setGrade) {
		grade = setGrade;
	}
	public String getGrade() {
		return grade;
	}
}
