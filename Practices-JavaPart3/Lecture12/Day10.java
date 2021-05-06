package com.ctf.Lecture12;

public class Day10 {

	public static void main(String[] args) {
		
		Employee employees = new Employee("Mark" , "Jobs", 30000);
		
		System.out.println(employees.getSalary());
		
		CEO ceo = new CEO("Steve", "Gate", 70000);
		System.out.println(ceo.getSalary());
		
		
		
		Programmer programmer1 = new Programmer("Bill", "Musk" , 60000);
		
		System.out.println(programmer1.getSalary());
		
		
		//Test Constructor Overloading
		Programmer programmer2 = new Programmer("A", "Jr", 50000, "Avaliable");
		
		System.out.println(programmer2.workStatus);
		

	}

}
