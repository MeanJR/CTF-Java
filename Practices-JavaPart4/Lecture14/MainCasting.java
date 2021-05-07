package com.ctf.Lecture14;

import java.util.ArrayList;

public class MainCasting {

	public static void main(String[] args) {
		Employee james = new Employee("James", "Bond", 70000);
		Employee ceo = new CEO("Tony", "Stark", 100000);
		Programmer prog = new Programmer("Captain", "Marvel", 50000);
		
		CEO ceo2 = (CEO)ceo;
		//CEO ceo3 = new Employee("Jame", "Silver", 5000);
		
		//CEO ceo4 = (CEO)james;
		
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(james);
		myList.add(prog);
		
		CEO ceo3 = (CEO)myList.get(0);
		Employee james2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		
		ceo3.getSalary();
		prog2.getSalary();
		
		
		CEO newCEO = new CEO("Captain", "Marvel", 300000);
		IWebsiteCreator  web = new Programmer("Sam", "Smith", 50000);
		Programmer web2 = (Programmer) web;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		
		newCEO.orderWebsite(web);
		newCEO.orderWebsite(web2);
		newCEO.orderWebsite(alphaGo);
		newCEO.orderWebsite(alphaGo2);

	}

}
