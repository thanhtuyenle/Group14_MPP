package lab2.prob4A;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet = new ArrayList<TranscriptEntry>();
	
	public Section(String courseName, int sectionNumber) {
		super();
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
	}
	
	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}

	public void addGrade(TranscriptEntry entry) {
		gradeSheet.add(entry);
	}
	
}
