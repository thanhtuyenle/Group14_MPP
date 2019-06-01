package lab2.prob4A;

import java.util.ArrayList;
import java.util.List;

public class StudentSectionFactory {
	private List<TranscriptEntry> transcriptEntries = new ArrayList<>();
	
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		if(s == null || sect == null) 
			throw new IllegalArgumentException("Student and Section cannot be null");
		TranscriptEntry transcriptEntry = new TranscriptEntry(s, sect, grade);
		
		s.addGrades(transcriptEntry);
		sect.addGrade(transcriptEntry);
	}	
	
	public Section createSection(int secNum, String courseName) {
		if(courseName == null) 
			throw new IllegalArgumentException("Course name cannot be null");
		
		Section section = new Section(courseName, secNum);
		return section;
	}
	
	public Student createStudent(String id, String name) {
		if(name == null) 
			throw new IllegalArgumentException("Student name cannot be null");
		
		Student student = new Student(id, name);
		return student;
	}
	
}
