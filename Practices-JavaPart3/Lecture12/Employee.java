package com.ctf.Lecture12;

public class Employee {
	public String firstName;
	public String lastName;
	private int  salary;
	//public String position;
	
	
	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}
	
	public int getSalary() {
		
		return this.salary;
	}


}
