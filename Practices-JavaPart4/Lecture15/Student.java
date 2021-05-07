package com.ctf.Lecture15;

public class Student extends EducationPersonnel {
	
	
	final String EndDate = " ";
	
	public final String getStart() {
		
		return "7 May 2021";
	}
	
	
	
	public LevelStatus.Levels levels;
	
	
	
	@Override
	public String getFullName() {
		
		return "Marry Jane";
		
	}

	@Override
	public String getStatus() {
		
		return null;
	}

	@Override
	public String getUrlImage() {
	
		return null;
	}

	@Override
	public String getGrade() {
		
		return null;
	}

}
