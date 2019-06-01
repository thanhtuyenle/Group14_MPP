package lab2.prob4A;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades = new ArrayList<TranscriptEntry>();
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}

	public void addGrades(TranscriptEntry grade) {
		grades.add(grade);
	}
	
	
	
	
}
