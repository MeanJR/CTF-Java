package com.ctf.Lecture14;

public class Programmer extends Employee implements IWebsiteCreator {
	
	public Programmer(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}


	public void work() {
		
		CreateWebsite();
		FixPC();
		InstallWindows();
	}
	
	
	public void CreateWebsite() {
		
		System.out.println("Create Web Site");
	}
	public void FixPC() {
		
		System.out.println("Fix PC");
	}
	public void InstallWindows() {
		
		System.out.println("Install Windows");
	}


	@Override
	public void createWebsite(String template, String titleName) {
		
		
	}

}
