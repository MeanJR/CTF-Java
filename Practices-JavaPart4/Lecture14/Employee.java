package com.ctf.Lecture14;

public class Employee {
	
	public String firstName;
	public String lastName;
	private int salary;

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}

	public int getSalary() {

		
		print(Integer.toString(this.salary));

		return this.salary;
		
	}
	
	public void print(String result) {
		
		System.out.println(result);
	}

}
