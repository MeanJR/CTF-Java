package com.ctf.Lecture12;

public class Programmer extends Employee {
	
	public String workStatus;
	
	
	public Programmer(String firstName, String lastName, int salary) {
		
		super(firstName, lastName, salary);
	}
	
	@Override
	public int getSalary() {
		
		return super.getSalary();
	}
	
	public void createWebsite(String template, String titleName){
		
	   System.out.println(" ++++++ ");
		
	}
	
	public void installWindows(String version, String productKey) {
		
		System.out.println("--------");
	}
	
	
	//Constructor Overloading
	public Programmer(String firstName, String lastName, int salary, String workStatus) {
		
		super(firstName, lastName, salary);
		this.workStatus = workStatus;
	}

}
