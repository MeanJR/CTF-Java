package com.ctf.Lecture14;

public class CEO extends Employee{
	
	public CEO(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);
		
	}

	public void work() {
		Seminar();
		Hire();
		Golf();
		Fire();

	}
	
	public void Seminar() {
		
		System.out.println("Seminar");
	}
	public void Hire() {
		
		System.out.println("Hire");
	}
	public void Golf() {
		
		System.out.println("Golf");
	}
	public void Fire() {
		
		System.out.println("Fire");
	}
	
	
	public void orderWebsite(IWebsiteCreator creator) {
		
		creator.createWebsite("Test Template","Test title" );
	}
	
}
