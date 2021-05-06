package com.crf.Lecture13;

public class Employee {
	public String firstName;
	public String lastName;
	private int salary;
	
	//1
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
	
	
	//2
	public void checkPosition() {
		
		System.out.println("The position is "+position);
	}
	
	
	//4 
	
	public String getFullName() {
		
		return firstName + " " + lastName;
	}
	
	
	//3
	
	public static void main(String[] args) {
		
		String fullName;
		
		Employee employees1 = new Employee("fristName", "lastName", 50000, "Vice Manager" );
		
		employees1.checkPosition();
		
		Employee employee2 = new Employee("John", "Smith", 30000, "System Analize");
		
		fullName = employee2.getFullName();
		
		System.out.print(fullName + " ");
		
		employee2.checkPosition();
				
		
		
	}

}
