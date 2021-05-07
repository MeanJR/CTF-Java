package com.ctf.Lecture15;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		String fullName = student1.getFullName();
		
		student1.levels = LevelStatus.Levels.HEIGH; 
		
		System.out.println("Full Name : " + fullName +
							" Level : " + student1.levels);
		
	

	}

}