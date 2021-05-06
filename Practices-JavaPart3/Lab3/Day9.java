package com.ctf.lab10;

public class Day9 {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("A", "Walker", 30000, "PM");
		employees[1] = new Employee("Jame", "Runner", 25000, "Tester");
		employees[2] = new Employee("Bond", "Nice", 25000, "Tester");
		employees[3] = new Employee("Luke", "Hopes", 25000, "Developer");
		employees[4] = new Employee("steven", "strange", 25000, "Developer");
		
		
		
		System.out.println(employees[0].firstName);

	}

}
