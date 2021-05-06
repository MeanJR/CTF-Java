package com.ctf.lab10;

public class Employee {
	

	public String firstName;
	public String lastName;
	private int  salary;
	public String position;
	
	
	public Employee(String firstName, String lastName, int salary, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.position = position;
	}
	
	public int getSalary() {
		
		return this.salary;
	}


}
