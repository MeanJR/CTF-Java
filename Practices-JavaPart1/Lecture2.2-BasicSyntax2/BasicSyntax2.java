package com.ctf.BasicSyntax2;

//Lab 2.2

public class BasicSyntax2 {

	public static void main(String[] args) {
		
		//1
		bark();
		
		//2
		
		/* */
		
		
		System.out.println(" ============================= ");
		
		float myFloat = 23.1f; //Convert to int
		int conInt = (int)myFloat;
		System.out.println("The new integer is :" + conInt);
		System.out.println("The old float is : " +myFloat);
		
		System.out.println(" ============================= ");
		
		int myInt = 5;
		float conFloat = myInt; //Convert to float
		System.out.println("The new float is :" + conFloat);
		System.out.println("The old integer is : " +myInt);
		
		System.out.println(" ============================= ");
		
		double myDouble = 44.554555423d;
		float conFloat2 = (float)myDouble;
		System.out.println("The new float is : "+ conFloat2);
		System.out.println("The old Double is : " + myDouble);
		
		System.out.println(" ============================= ");
		
		char myChar = 'A';
		int conInt2 = (int)myChar;
		System.out.println("The new integer is : " + conInt2);
		System.out.println("The old Character is :"+ myChar);
		
		//3
		final String hello = "Hello";
		System.out.println(hello);
		hello = "World";
		System.out.println(hello);
		
		

	}
	
	public static void bark() {
		
		String dogName = "Jeff";
		
		System.out.println("The dog name = "+dogName+ " brak");
	}
	
	


}
