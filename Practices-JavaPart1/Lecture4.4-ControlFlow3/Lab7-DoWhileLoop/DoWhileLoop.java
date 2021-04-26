package com.ctf.DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean checkOddNum = false;
		
		// 1
		int i = 20;
		do{
			
			System.out.println(i);
			i--;
			
		}while(i > 0);
		
		//2
		
		do {
			
			System.out.println("Please Input your Number : ");
			int inputNum = sc.nextInt();
			
			if(inputNum % 2 != 0) {
				
				System.out.println("Odd Number");
				checkOddNum = true;
				
			}else {
				
				
				System.out.println("Even Number");
				checkOddNum = false;
				
				System.out.println("The END");
				
			}
			
		}while(checkOddNum == false);
		
		
	}

}
