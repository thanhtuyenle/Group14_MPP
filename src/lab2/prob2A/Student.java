package lab2.prob2A;

public class Student {

	private String studentName;
	private GradeReport gradeReport;

	public Student (String name) {
		this.studentName = name;
		gradeReport = new GradeReport(this);
	}
	public String getStudentName() {
		return studentName;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}

	@Override
	public String toString() {
		return studentName;
	}
}
